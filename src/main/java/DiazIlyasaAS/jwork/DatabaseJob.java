package DiazIlyasaAS.jwork;
import java.util.ArrayList;

/**
 * Merupakan class untuk Database Job, digunakan untuk mengatur segala data terkait suatu pekerjaan, atau database pekerjaan.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22-04-2021
 */
public class DatabaseJob {
    //instance variable
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    /**
     * Method getter (accessor) yang bernama getJobDatabase, berfungsi untuk mengambil isi list data JOB_DATABASE;
     *
     * @return JOB_DATABASE mengembalikkan semua isi data JOB_DATABASE
     */
    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;
    }

    /**
     * Method getter (accessor) yang bernama getLastId, berfungsi untuk mendapatkan Id dari Job terakhir
     *
     * @return lastId mengembalikkan isi variable lastId (id terkahir)
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Method getter (accessor) yang bernama getJobById, berfungsi untuk mendapatkan data Job berdasarkan Id nya
     *
     * @param id yaitu menggunakan inputan id job untuk menampilkan data job yang sesuai
     * @return temp sebagai objek dari Job
     */
    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (id == JOB_DATABASE.get(i).getId()) {
                temp = JOB_DATABASE.get(i);
            }
        }
        if (temp == null) {
            throw new JobNotFoundException(id);
        }
        return temp;
    }

    /**
     * Method getter (accessor) yang bernama getJobByRecruiter, berfungsi untuk mendapatkan data Job berdasarkan Id Recruiter
     *
     * @param recruiterId yaitu menggunakan inputan id recruiter untuk menampilkan job yang sesuai
     * @return temp sebagai objek dari data list Job
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> temp = null;
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                if (temp == null) {
                    temp = new ArrayList<Job>();
                }
                temp.add(job);
            }
        }
        return temp;
    }

    /**
     * Method getter (accessor) yang bernama getJobByCategory, berfungsi untuk mendapatkan data Job berdasarkan kategorinya
     *
     * @param category yaitu menggunakan kategori dari job untuk menampilkan data job yang sesuai
     * @return temp sebagai objek dari data list Job
     */
    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }

    /**
     * Method addJob, berfungsi untuk menambahkan data Job baru kedalam Database Job
     *
     * @param job sebagai inputan data job baru yang akan ditambahkan ke Database Job
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * Method removeJob, berfungsi untuk menghapus data Job yang ada di dalam Database Job
     *
     * @param id sebagai inputan untuk menghapus job berdasarkan Id yang diinputkan
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean status = false;
        for (Job job : JOB_DATABASE) {
            if (job.getId() == id) {
                JOB_DATABASE.remove(job);
                status = true;
                break;
            }
        }
        if (!status){
            throw new JobNotFoundException(id);
        }
        return status;
    }
}
