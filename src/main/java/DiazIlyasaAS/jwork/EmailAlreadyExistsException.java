package DiazIlyasaAS.jwork;

/**
 * Kelas EmailAlreadyExistsException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) pada email dari jobseeker, jika adanya email baru yang ditambahkan kedatabase jobseeker sama dengan data emmail yang sudah ada di dalamnya
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 06-05-2021
 */
public class EmailAlreadyExistsException extends Exception {
    // Instance Variable
    private Jobseeker jobseeker_error;

    /**
     * Constructor default kelas EmailAlreadyExistsException.
     *
     * @param jobseeker_input merupakan nilai inputan untuk variable jobseeker_input yang berisi email dari jobseeker baru yang terdeteksi sama dengan email yang sudah ada di Dalam Database Jobseeker
     */
    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        this.jobseeker_error = jobseeker_input;
    }

    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + " already exists.";
    }
}