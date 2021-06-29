package DiazIlyasaAS.jwork.controller;

import DiazIlyasaAS.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Kelas RecruiterController, berfungsi untuk mengatur (control) data recruiter melalui Web API Service
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 20-05-2021
 */
@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    /**
     * Method getter (accessor) yang bernama getAllRecruiter, berfungsi untuk menampilkan semua data recruiter yang ada didalam database
     *
     * @return semua data recruiter yang ada didatabase
     */
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter() {
        return DatabaseRecruiter.getRecruiterDatabase();
    }

    /**
     * Method getter (accessor) yang bernama getRecruiterById, berfungsi untuk mendapatkan data recruiter berdasarkan id nya
     *
     * @param id sebagai inputan id dari recruiter yang akan ditampilkan
     * @return data recruiter yang sesuai dengan id yang diinputkan
     */
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        return recruiter;
    }

    /**
     * Method addRecruiter, berfungsi untuk menambahkan data recruiter baru kedalam Database
     *
     * @param name sebagai inputan data nama
     * @param email sebagai inputan data email
     * @param phoneNumber sebagai inputan data nomor telepon
     * @param province sebagai inputan data provinsi
     * @param description sebagai inputan data deskripsi wilayah
     * @param city sebagai inputan data kota
     *
     * @return recruiter jadi menampilkan data recruiter yang berhasil ditambahkan, return null atau data kosong jika recruiter gagal ditambahkan ke database
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="description") String description,
                                  @RequestParam(value="city") String city) {
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, new Location(province, city, description));
        try{
            DatabaseRecruiter.addRecruiter(recruiter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return recruiter;
    }
}