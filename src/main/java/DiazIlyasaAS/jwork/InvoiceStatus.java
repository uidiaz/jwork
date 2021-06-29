package DiazIlyasaAS.jwork;

/**
 * Kelas Enum InvoiceStatus, mendefiniskan data status dari suatu Invoice.
 * Enum type merupakan sebuah tipe data khusus yang membuat suatu variable
 * menjadi sekumpulan konstanta yang telah ditentukan sebelumnya.
 * Jadi sederhananya Kelas Enum  merupakan sekumpulan variable yang
 * didefinisikan menjadi tipe data konstanta (konstan).
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01-03-2021
 */
public enum InvoiceStatus {
    //Tipe data enum yang sudah diset dengan nilai String konstan
    OnGoing("On Going"), 
    Finished("Finished"),
    Cancelled("Cancelled");

    /*Instance Variable.
     *Diatur dengan access modifier private
     *Tipe data variablenya adalah String*/
    private String invoicestatus;

    /**
     * Sebuah Constructor class Enum yang bernama InvoiceStatus.
     * Access Modifier pada constrcutor ini berjenis private.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     *
     * @param invoicestatus merupakan nilai inputan untuk variable status
     *
     */
    InvoiceStatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;   
    }

    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Return type dari method bertipe String.
     * Access Modifier diatur public.
     * Jadi ketika data enum yang sudah dideklarasikan diatas dipanggil pada kelas lain untuk di print,
     * maka data yang diprint adalah nilai konstan string yang sudah diset pada masing - masing data enum tersebut.
     *
     * @return status jadi mengembalikkan nilai atau data yang ada didalam variable status
     *
     */
    public String toString() {
        return invoicestatus;
    }
}
