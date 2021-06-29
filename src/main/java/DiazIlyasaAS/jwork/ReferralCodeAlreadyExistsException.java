package DiazIlyasaAS.jwork;

/**
 * Kelas ReferralCodeAlreadyExistsException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) pada referral code, jika adanya referral code baru yang ditambahkan kedatabase bonus sama dengan data referral code yang sudah ada di dalamnya
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 06-05-2021
 */
public class ReferralCodeAlreadyExistsException extends Exception {
    // Instance Variable
    private Bonus referral_error;

    /**
     * Constructor default kelas EmailAlreadyExistsException.
     *
     * @param referral_input merupakan nilai inputan untuk variable referral_input yang berisi referral code baru yang terdeteksi sama dengan referral code yang sudah ada di dalam Database Bonus
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Referral Code: ");
        this.referral_error = referral_input;
    }

    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    public String getMessage() {
        return super.getMessage() + referral_error.getReferralCode() + " already exists.";
    }
}
