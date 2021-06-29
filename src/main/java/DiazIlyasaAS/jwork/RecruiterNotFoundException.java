package DiazIlyasaAS.jwork;

/**
 * Kelas RecruiterNotFoundException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) pada recruiter, jika recruiter yang diinputkan ternyata tidak ada di Database Recruiter
 *
 * @author Helmi Arrazy
 * @version 06-05-2021
 */
public class RecruiterNotFoundException extends Exception{
    // Instance Variable
    private int recruiter_error;

    /**
     * Constructor default kelas JobNotFoundException.
     *
     * @param recruiter_input merupakan nilai inputan untuk variable recruiter_input yang berisi id dari recruiter
     */
    public RecruiterNotFoundException(int recruiter_input) {
        super("Recruiter Id: ");
        recruiter_error = recruiter_input;
    }

    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    public String getMessage() {
        return super.getMessage() + recruiter_error + "not found";
    }
}
