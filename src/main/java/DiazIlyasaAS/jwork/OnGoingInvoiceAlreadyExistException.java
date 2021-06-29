package DiazIlyasaAS.jwork;

/**
 * Kelas EmailAlreadyExistsException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) jika adanya invoice baru yang statusnya OnGoing, sementara invoice dengan status tersebut sudah ada di dalam Database Invoice
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 08-05-2021
 */
public class OnGoingInvoiceAlreadyExistException extends Exception{
    // Instance Variable
    private Invoice invoice_error;

    /**
     * Constructor default kelas OngoingInvoiceAlreadyExistsException.
     *
     * @param invoice_input merupakan nilai inputan untuk variable invoice_input yang berisi status dari invoice baru yang terdeteksi mempunyai status OnGoing
     */
    public OnGoingInvoiceAlreadyExistException(Invoice invoice_input) {
        super("Invoice Status: ");
        invoice_error = invoice_input;
    }

    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + "Already Exists";
    }
}