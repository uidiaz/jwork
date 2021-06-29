package DiazIlyasaAS.jwork;
import java.util.ArrayList;

/**
 * Kelas DatabaseJobseeker digunakan untuk mengatur segala data terkait suatu database pencari pekerjaan (Jobseeker).
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22-04-2021
 */
public class DatabaseJobseeker {
     // Instance Variable
     private static final ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
     private static int lastId = 0;

     /**
      * Method getter (accessor) yang bernama getDatabaseJobseeker, berfungsi untuk mengambil isi list data JOBSEEKER_DATABASE;
      *
      * @return JOBSEEKER_DATABASE mengembalikkan semua isi data JOBSEEEKER_DATABASE
      */
     public static ArrayList<Jobseeker> getDatabaseJobseeker() {
          return JOBSEEKER_DATABASE;
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
      * Method getter (accessor) yang bernama getJobseekerById, berfungsi untuk mendapatkan data Jobseeker berdasarkan Id nya
      *
      * @param id yaitu menggunakan inputan id dari jobseeker untuk mendapatkan data jobseeker yang sesuai
      * @return temp sebagai objek dari Jobseeker
      */
     public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
          Jobseeker temp = null;
          for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
               if (id == jobseeker.getId()) {
                    temp = jobseeker;
                    return temp;
               }
          }
          throw new JobSeekerNotFoundException(id);
     }

     /**
      * Method addJobseeker, berfungsi untuk menambahkan data Jobseeker baru kedalam Database Jobseeker
      *
      * @param jobseeker sebagai inputan data jobseeker baru yang akan ditambahkan ke Database Jobseeker
      * @return booelan untuk menunjukkan keberhasilan dari method ini
      */
     public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
          for (Jobseeker jobseeker1 : JOBSEEKER_DATABASE) {
               if (jobseeker1.getEmail().equals(jobseeker.getEmail())) {
                    throw new EmailAlreadyExistsException(jobseeker);
               }
          }
          JOBSEEKER_DATABASE.add(jobseeker);
          lastId = jobseeker.getId();
          return true;
     }

     /**
      * Method removeJobsekeer, berfungsi untuk menghapus data Jobseeker yang ada di dalam Database Jobseeker
      *
      * @param id sebagai inputan untuk menghapus jobseeker berdasarkan Id yang diinputkan
      * @return booelan untuk menunjukkan keberhasilan dari method ini
      */
     public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
          for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
               if (jobseeker.getId() == jobseeker.getId()) {
                    JOBSEEKER_DATABASE.remove(jobseeker);
                    return true;
               }
               throw new JobSeekerNotFoundException(id);
          }
          return false;
     }

     /**
      * Method getter (accessor) yang bernama getJobsekeerLogin, berfungsi untuk mendapatkan data kredensial login (email dan password) dari Jobseeker
      *
      * @param email sebagai inputan untuk mendapatkan data Jobseeker berdasarkan email yang diinputkan
      * @param password sebagai inputan untuk mendapatkan data Jobseeker berdasarkan password yang diinputkan
      * @return jobseeker menampilkan data jobseeker berdasarkan kedua parameter yang telah diinputkan (email dan password) jika email dan password tersebut ada didalam database, sedangkan return null menampilkan data kosong jika email dan password yang diinputkan untuk login tidak terdaftar didalam database
      */
     public static Jobseeker getJobseekerLogin(String email, String password){
          for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
               if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                    return jobseeker;
               }
          }
          return null;
     }
}
