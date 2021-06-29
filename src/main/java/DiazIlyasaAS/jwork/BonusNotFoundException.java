package DiazIlyasaAS.jwork;

/**
 * Kelas BonusNotFoundException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) pada bonus, jika bonus yang diinputkan ternyata tidak ada di Database Bonus
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 06-05-2021
 */
public class BonusNotFoundException extends Exception {
    // Instance Variable
    private int bonus_error;

    /**
     * Constructor default kelas BonusNotFoundException.
     *
     * @param bonus_input merupakan nilai inputan untuk variable bonus_input yang berisi id dari bonus
     */
    public BonusNotFoundException(int bonus_input) {
        super("Referral Code ID: ");
        this.bonus_error = bonus_input;
    }

    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    @Override
    public String getMessage(){
        return super.getMessage() + bonus_error + " Not Found";
    }
}
