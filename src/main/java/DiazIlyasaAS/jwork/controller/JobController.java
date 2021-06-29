package DiazIlyasaAS.jwork.controller;

import DiazIlyasaAS.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Kelas JobController, berfungsi untuk mengatur (control) data job melalui Web API Service
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 20-05-2021
 */
@RequestMapping("/job")
@RestController
public class JobController {

    /**
     * Method getter (accessor) yang bernama getAllJob, berfungsi untuk menampilkan semua data job yang ada didalam database
     *
     * @return semua data job yang ada didatabase
     */
    @RequestMapping("")
    public ArrayList<Job> getAllJob() {
        return DatabaseJob.getJobDatabase();
    }

    /**
     * Method getter (accessor) yang bernama getJobById, berfungsi untuk mendapatkan data job berdasarkan id nya
     *
     * @param id sebagai inputan id dari job yang akan ditampilkan
     * @return data job yang sesuai dengan id yang diinputkan
     */
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return job;
    }

    /**
     * Method getter (accessor) yang bernama getJobByRecruiter, berfungsi untuk mendapatkan data Job berdasarkan Id Recruiter
     *
     * @param recruiterId yaitu menggunakan inputan id recruiter untuk menampilkan job yang sesuai
     * @return data job yang sesuai dengan id recruiter yang telah diinputkan
     */
    @RequestMapping("/recruiter/{recruiterId}")
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByRecruiter(recruiterId);
        return job;
    }

    /**
     * Method getter (accessor) yang bernama getJobByCategory, berfungsi untuk mendapatkan data Job berdasarkan kategorinya
     *
     * @param category yaitu menggunakan kategori dari job untuk menampilkan data job yang sesuai
     * @return data job yang sesuai dengan kategorinya yang telah diinputkan
     */
    @RequestMapping("/category/{category}")
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByCategory(category);
        return job;
    }

    /**
     * Method addJob, berfungsi untuk menambahkan data Job baru kedalam Database
     *
     * @param name sebagai inputan data nama
     * @param fee sebagai inputan data fee
     * @param category sebagai inputan data category
     * @param recruiterId sebagai inputan data id recruiter
     *
     * @return job jadi menampilkan data job yang berhasil ditambahkan, sedangkan return null atau data kosong jika job gagal ditambahkan ke database
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value = "name") String name,
                      @RequestParam(value = "fee") int fee,
                      @RequestParam(value = "category") String category,
                      @RequestParam(value = "recruiterId") int recruiterId) {
        Job job = null;
        try {
            job = new Job(DatabaseJob.getLastId() + 1, name, DatabaseRecruiter.getRecruiterById(recruiterId), fee, JobCategory.valueOf(category));
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }
        boolean status = DatabaseJob.addJob(job);
        if (status == true) {
            return job;
        } else {
            return null;
        }
    }
}
