package DiazIlyasaAS.jwork.controller;

import DiazIlyasaAS.jwork.*;
import org.springframework.web.bind.annotation.*;
import static DiazIlyasaAS.jwork.DatabaseJobseekerPostgre.getJobseekerLogin;

/**
 * Kelas JobseekerController, berfungsi untuk mengatur (control) data jobseeker melalui Web API Service
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 20-05-2021
 */
@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    /**
     * Method getter (accessor) yang bernama getJobseekerById, berfungsi untuk mendapatkan data jobseeker berdasarkan id nya
     *
     * @param id sebagai inputan id dari jobseeker yang akan ditampilkan
     * @return data jobseeker yang sesuai dengan id yang diinputkan
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * Method loginJobseeker, berfungsi untuk melakukan login ke aplikasi berdasarkan email dan password
     *
     * @param email sebagai inputan variable email
     * @param password sebagai inputan variable password
     * @return object jobseeker yang telah melakukan login
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value = "email") String email,
                                    @RequestParam(value = "password") String password) {
        return (getJobseekerLogin(email, password));
    }

    /**
     * Method registerJobseeker, berfungsi untuk melakukan registrasi atau menambahkan data jobseeker baru ke database
     *
     * @param name sebagai inputan untuk nama jobseeker
     * @param email sebagai inputan untuk email dari jobseeker
     * @param password sebagai inputan untuk password
     * @return objek jobseeker jika berhasil
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value = "name") String name,
                                       @RequestParam(value = "email") String email,
                                       @RequestParam(value = "password") String password) {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastJobseekerId() + 1, name, email, password);
        try {
            DatabaseJobseekerPostgre.InsertJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }
}