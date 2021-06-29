package DiazIlyasaAS.jwork;

/**
 * Kelas Enum PaymentType, mendefiniskan data type/jenis dari suatu Payment/pembayaran.
 * Enum type merupakan sebuah tipe data khusus yang membuat suatu variable
 * menjadi sekumpulan konstanta yang telah ditentukan sebelumnya.
 * Jadi sederhananya Kelas Enum  merupakan sekumpulan variable yang
 * didefinisikan menjadi tipe data konstanta (konstan).
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01-03-2021
 */
public enum PaymentType {
    //Tipe data enum yang sudah diset dengan nilai String konstan
    BankPayment("Bank Payment"), 
    EwalletPayment("E-wallet Payment");

    /*Instance Variable.
     *Diatur dengan access modifier private
     *Tipe data variablenya adalah String*/
    private String paymenttype;

    /**
     * Sebuah Constructor class Enum yang bernama PaymentType.
     * Access Modifier pada constrcutor ini berjenis private.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     *
     * @param paymenttype merupakan nilai inputan untuk variable type
     */
    PaymentType(String paymenttype) {
        this.paymenttype = paymenttype;   
    }

    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Return type dari method bertipe String.
     * Access Modifier diatur public.
     * Jadi ketika data enum yang sudah dideklarasikan diatas dipanggil pada kelas lain untuk di print,
     * maka data yang diprint adalah nilai konstan string yang sudah diset pada masing - masing data enum tersebut.
     *
     * @return type jadi mengembalikkan nilai atau data yang ada didalam variable type
     */
    public String toString() {
        return paymenttype;
    }
}