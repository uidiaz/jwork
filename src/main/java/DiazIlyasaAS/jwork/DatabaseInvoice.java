package DiazIlyasaAS.jwork;
import java.util.ArrayList;

/**
 * Merupakan class untuk DatabaseInvoice, digunakan untuk mengatur segala data terkait suatu invoice, atau database invoice dari suatu pekerjaan.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22-04-2021
 */
public class DatabaseInvoice {
    // Instance Variables
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    /**
     * Method getter (accessor) yang bernama getInvoiceDatabase, berfungsi untuk mengambil isi list data INVOICE_DATABASE;
     *
     * @return INVOICE_DATABASE mengembalikkan semua isi data INVOICE_DATABASE
     */
    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    /**
     * Method getter (accessor) yang bernama getLastId, berfungsi untuk mendapatkan Id dari Invoice terakhir
     *
     * @return lastId mengembalikkan isi variable lastId
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Method getter (accessor) yang bernama getInvoiceById, berfungsi untuk mendapatkan data Invoice berdasarkan Id nya
     *
     * @param id yaitu menggunakan inputan id dari invoice untuk mendapaatkan data invoice yang sesuai
     * @return temp sebagai objek dari Invoice
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException {
        Invoice temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                temp = invoice;
            } else {
                temp = null;
            }
        }
        if (temp == null){
            throw new InvoiceNotFoundException(id);
        }
        return temp;
    }

    /**
     * Method getter (accessor) yang bernama getInvoiceByJobseeker, berfungsi untuk mendapatkan data Invoice berdasarkan Id Jobseeker
     *
     * @param jobseekerId yaitu menggunakan inputan id jobseeker untuk menampilkan invoice yang sesuai
     * @return temp sebagai objek dari data list Invoice
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId){
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerId == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }

    /**
     * Method addInvoice, berfungsi untuk menambahkan data Invoice baru kedalam Database Invoice
     *
     * @param invoice sebagai inputan data invoice baru yang akan ditambahkan ke Database Invoice
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean addInvoice(Invoice invoice) throws OnGoingInvoiceAlreadyExistException{
        for (Invoice invoices : INVOICE_DATABASE) {
            if (invoices.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                throw new OnGoingInvoiceAlreadyExistException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * Method changeInvoiceStatus, berfungsi untuk mengubah status dari invoice yang ada di dalam Database Invoice
     *
     * @param id sebagai inputan id untuk invoice yang akan diubah statusnya
     * @param invoiceStatus yaitu jenis status baru yang akan ditetapkan kepada status invoice yang akan diubah
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean changeInvoiceStatus(int id,InvoiceStatus invoiceStatus) {
        boolean temp = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                invoice.setInvoiceStatus(InvoiceStatus.OnGoing);
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        boolean temp = false;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                INVOICE_DATABASE.remove(id);
                temp = true;
            } else {
                temp = false;
            }
        }
        if (!temp) {
            throw new InvoiceNotFoundException(id);
        }
        return temp;
    }
}