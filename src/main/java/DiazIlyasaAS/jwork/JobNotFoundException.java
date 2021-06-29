package DiazIlyasaAS.jwork;

/**
 * Kelas JobNotFoundException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) pada job, jika job yang diinputkan ternyata tidak ada di Database Job
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  06-03-2021
 */
public class JobNotFoundException extends Exception{
    // Instance Variable
    private int job_error;

    /**
     * Constructor default kelas JobNotFoundException.
     *
     * @param job_input merupakan nilai inputan untuk variable job_input yang berisi id dari job
     */
    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    public String getMessage(){
        return super.getMessage() + job_error + " Not Found";
    }
}