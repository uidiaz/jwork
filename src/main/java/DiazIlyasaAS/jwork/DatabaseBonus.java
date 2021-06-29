package DiazIlyasaAS.jwork;
import java.util.ArrayList;

/**
 * Merupakan class untuk DatabaseBonus, digunakan untuk mengatur segala data terkait suatu bonus, atau database bonus pekerjaan.
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22-04-2021
 */
public class DatabaseBonus {
    // instance variables
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    /**
     * Method getter (accessor) yang bernama getBonusDatabase, berfungsi untuk mengambil isi list data BONUS_DATABASE;
     *
     * @return BONUS_DATABASE mengembalikkan semua isi data BONUS_DATABASE
     */
    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    /**
     * Method getter (accessor) yang bernama getLastId, berfungsi untuk mendapatkan Id terakhir dari Bonus
     *
     * @return lastId mengembalikkan isi variable lastId
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Method getter (accessor) yang bernama getBonusById, berfungsi untuk mendapatkan data Bonus berdasarkan Id nya
     *
     * @param id yaitu menggunakan inputan id dari bonus untuk menampilkan data bonus yang sesuai
     * @return temp sebagai objek dari Bonus
     */
    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                temp = bonus;
                return temp;
            }
        }
        if (temp == null) {
            throw new BonusNotFoundException(id);
        }
        return temp;
    }

    /**
     * Method getter (accessor) yang bernama getBonusByReferralCode, berfungsi untuk mendapatkan data Bonus berdasarkan referral code nya
     *
     * @param referralCode yaitu menggunakan inputan referral code dari bonus untuk menampilkan data bonus yang sesuai
     * @return temp sebagai objek dari Bonus
     */
    public static Bonus getBonusByReferralCode(String referralCode) {
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (referralCode.equals(bonus.getReferralCode())) {
                temp = bonus;
            }
        }
        return temp;
    }

    /**
     * Method addBonus, berfungsi untuk menambahkan data Bonus baru kedalam Database Bonus
     *
     * @param bonus sebagai inputan data bonus baru yang akan ditambahkan ke Database Bonus
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus bonus1 : BONUS_DATABASE) {
            if (bonus.getReferralCode() == bonus1.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    /**
     * Method activeBonus, berfungsi untuk aktivasi data bonus yang ada pada Database Bonus
     *
     * @param id sebagai inputan id untuk bonus yang akan diaktifkan
     * @return temp yang berisikan data boolean untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean activateBonus(int id) {
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                temp = true;
            }
        }
        return temp;
    }

    /**
     * Method deactiveBonus, berfungsi untuk menonaktifkan bonus yang ada pada Database Bonus
     *
     * @param id sebagai inputan id untuk bonus yang akan dinonaktifkan
     * @return temp yang berisikan data boolean untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean deactivateBonus(int id) {
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                temp = true;
            }
        }
        return temp;
    }

    /**
     * Method removeBonus, berfungsi untuk menghapus bonus yang ada pada Database Bonus
     *
     * @param id sebagai inputan id untuk bonus yang akan dihapus
     * @return boolean untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean removeBonus(int id) throws BonusNotFoundException {
        try {
            for (Bonus bonus : BONUS_DATABASE) {
                if (bonus.getId() == id) {
                    BONUS_DATABASE.remove(bonus);
                    return true;
                }
            }
        } catch (Exception e) {
            throw new BonusNotFoundException(id);
        }
        return false;
    }
}
