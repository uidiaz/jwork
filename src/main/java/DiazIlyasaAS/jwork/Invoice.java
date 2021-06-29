package DiazIlyasaAS.jwork;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Kelas abstract Invoice, dalam kelas ini terdapat beberapa method acessor (get), mutator (set), dan method abstract.
 * Kelas ini merupakan Superclass dari kelas EwalletPayment dan BankPayment.
 * Sesuai dengan nama kelasnya (Invoice) yang berarti faktur, sepertinya akan digunakan untuk mengatur segala data terkait suatu pembayaran/tagihan.
 * Didalam kelas ini juga ada beberapa access modifier (public, private, dan protected) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * Access Modifier bersifat protected berarti hanya bisa diakses oleh kelas itu sendiri, subclass nya, dan kelas lain tetapi harus dalam package yang sama.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22-04-2021
 */
public abstract class Invoice {
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private dan protected
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Sebuah Constructor default yang bernama Invoice.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param jobs  merupakan nilai inputan untuk variable job
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.date = Calendar.getInstance();
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
     * Sebuah method getter (accessor) yang bernama getJobs untuk mendapatkan/mengembalikkan data job.
     *
     * @return job jadi mengembalikkan nilai yang ada didalam variable job
     */
    public ArrayList<Job> getJobs() {
        return jobs;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getDate untuk mendapatkan/mengembalikkan data tanggal (date).
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return date jadi mengembalikkan nilai yang ada didalam variable date
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getTotalFee untuk mendapatkan/mengembalikkan data totalFee.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return totalFee jadi mengembalikkan nilai yang ada didalam variable totalFee
     */
    public int getTotalFee() {
        return totalFee;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getJobseeker untuk mendapatkan/mengembalkikan data jobseeker.
     * Return type dari method ini adalah Jobseeker (yang merupakan class).
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return jobseeker jadi mengembalikkan nilai yang ada didalam variable jobseeker
     */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }

    /**
     * Sebuah method abstract yang bernama getPaymentType, dengan return type void.
     * Tidak ada parameter yang digunakan.
     * Access modifier pada method berjenis public.
     *
     */
    public abstract PaymentType getPaymentType();

    /**
     * Sebuah method getter (accessor) yang bernama getInvoiceStatus untuk mendapatkan/mengembalkikan data invoiceStatus.
     * Return type dari method ini adalah InvoiceStatus (yang merupakan class).
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return invoiceStatus jadi mengembalikkan nilai yang ada didalam variable invoiceStatus
     */
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
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
     * Sebuah method setter (mutator) yang bernama setJob untuk menetapkan/mengisi nilai dari variable job.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu job.
     * Access modifier pada method berjenis public
     *
     * @param jobs digunakan sebagai inputan untuk variable job
     */
    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setDate untuk menetapkan/mengisi nilai dari variable date.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu date.
     * Access modifier pada method berjenis public.
     *
     * @param date digunakan sebagai inputan untuk variable date
     */
    public void setDate(Calendar date) {
        this.date = Calendar.getInstance();
    }

    public void setDate(int year, int month, int dayOfMonth) {
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    /**
     * Sebuah method abstract yang bernama setTotalFee, dengan return type void.
     * Tidak ada parameter yang digunakan.
     * Access modifier pada method berjenis public.
     *
     */
    public abstract void setTotalFee();

    /**
     * Sebuah method setter (mutator) yang bernama setJobseeker untuk menetapkan/mengisi nilai dari variable jobseeker.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu jobseeker.
     * Access modifier pada method berjenis public.
     *
     * @param jobseeker digunakan sebagai inputan untuk variable jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setInvoiceStatus untuk menetapkan/mengisi nilai dari variable invoiceStatus.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu invoiceStatus.
     * Access modifier pada method berjenis public.
     *
     * @param invoiceStatus digunakan sebagai inputan untuk variable invoiceStatus
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * Sebuah method abstract yang bernama toString, dengan return type String.
     * Tidak ada parameter yang digunakan.
     * Access modifier pada method berjenis public.
     *
     */
    public abstract String toString();
    
}
