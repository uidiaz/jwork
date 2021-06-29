package DiazIlyasaAS.jwork.controller;

import DiazIlyasaAS.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


/**
 * Kelas BonusController, berfungsi untuk mengatur (control) data bonus melalui Web API Service
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 20-05-2021
 */
@RequestMapping("/bonus")
@RestController
public class BonusController {

    /**
     * Method getter (accessor) yang bernama getAllBonus, berfungsi untuk menampilkan semua data bonus yang ada didalam database
     *
     * @return semua data bonus yang ada didatabase
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus() {
        return (DatabaseBonus.getBonusDatabase());
    }

    /**
     * Method getter (accessor) yang bernama getBonusByReferralCode, berfungsi untuk mendapatkan data Bonus berdasarkan referral code nya
     *
     * @param referralCode yaitu menggunakan inputan referral code dari bonus untuk menampilkan data bonus yang sesuai
     * @return data bonus yang sesuai dengan referral code yang telah diinputkan
     */
    @RequestMapping("/{referralCode}")
    public Bonus getBonusByReferralCode(
            @PathVariable String referralCode){
        return(DatabaseBonus.getBonusByReferralCode(referralCode));
    }

    /**
     * Method addBonus, berfungsi untuk menambahkan data bonus baru kedalam Database
     *
     * @param referralCode sebagai inputan untuk data referral code
     * @param extraFee sebagai inputan untuk data extra fee
     * @param minTotalFee sebagai inputan untuk data minimal total fee
     * @param active sebagai inputan untuk status aktif dari bonus
     *
     * @return bonus jadi menampilkan data bonus yang berhasil ditambahkan, sedangkan return null atau data kosong jika bonus gagal ditambahkan ke database.
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value = "referralCode") String referralCode,
            @RequestParam(value = "extraFee") int extraFee,
            @RequestParam(value = "minTotalFee") int minTotalFee,
            @RequestParam(value = "active") boolean active

    ) throws ReferralCodeAlreadyExistsException {
        Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        try {
            DatabaseBonus.addBonus(bonus);
        } catch (ReferralCodeAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return bonus;
    }
}
