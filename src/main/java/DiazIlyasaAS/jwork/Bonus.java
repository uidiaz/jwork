package DiazIlyasaAS.jwork;

/**
 * Merupakan class untuk Bonus, akan digunakan untuk mengatur segala data yang terkait dengan bonus pada suatu pekerjaan
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01-03-2021
 */
public class Bonus {
    // Deklarasi beberapa instance variables yang akan digunakan.
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

    /**
     * Constructor default kelas Bonus.
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param referralCode merupakan nilai inputan untuk variable referralCode
     * @param extraFee merupakan nilai inputan untuk variable extraFee
     * @param minTotalFee merupakan nilai inputan untuk variable minTotalFee
     * @param active merupakan nilai inputan untuk variable active ('True' or 'False)
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active) {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active; 
    }

    /**
     * Sebuah method getter (accessor) yang bernama getId untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return id jadi mengembalikkan nilai yang ada didalam variable id
     */
    public int getId() {
        return id;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getReferralCode untuk mendapatkan/mengembalikkan data referralCode.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return referralCode jadi mengembalikkan nilai yang ada didalam variable referralCode
     */
    public String getReferralCode() {
        return referralCode;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getExtraFee untuk mendapatkan/mengembalikkan data extraFee.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return extraFee jadi mengembalikkan nilai yang ada didalam variable extraFee
     */
    public int getExtraFee() {
        return extraFee;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getMinTotalFee untuk mendapatkan/mengembalikkan data minTotalFee.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return minTotalFee jadi mengembalikkan nilai yang ada didalam variable minTotalFee
     */
    public int getMinTotalFee() {
        return minTotalFee;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getActive untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah boolean.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return boolean jadi mengembalikkan nilai yang ada didalam variable active ('True' or 'False')
     */
    public boolean getActive() {
        return active;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setId untuk menetapkan/mengisi nilai dari variable id.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu id.
     * Access modifier pada method berjenis public.
     *
     * @param id digunakan sebagai inputan untuk variable id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setReferralCode untuk menetapkan/mengisi nilai dari variable referralCode.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu referralCode.
     * Access modifier pada method berjenis public.
     *
     * @param referralCode digunakan sebagai inputan untuk variable referralCode
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setExtraFee untuk menetapkan/mengisi nilai dari variable extraFee.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu extraFee.
     * Access modifier pada method berjenis public.
     *
     * @param extraFee digunakan sebagai inputan untuk variable extraFee
     */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setMinTotalFee untuk menetapkan/mengisi nilai dari variable minTotalFee.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu minTotalFee.
     * Access modifier pada method berjenis public.
     *
     * @param minTotalFee digunakan sebagai inputan untuk variable minTotalFee
     */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setActive untuk menetapkan/mengisi nilai dari variable active.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu active.
     * Access modifier pada method berjenis public.
     *
     * @param active digunakan sebagai inputan untuk variable active ('True' or 'False')
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Method toString, berfungsi untuk mencetak (print) instance variable ke layar
     *
     * @return semua isi data instance variable pada kelas ini
     */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nReferral Code = " + getReferralCode() + "\nExtra Fee = " + getExtraFee()
                + "\nMin Total Fee= " + getMinTotalFee() + "\nActive Status =  " + getActive();
    }
    
}