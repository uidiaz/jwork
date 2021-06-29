package DiazIlyasaAS.jwork;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Kelas BankPayment, dalam kelas ini terdapat beberapa method acessor (get) mutator (set) yang di Override dari Superclassnya.
 * Kelas ini digunakan untuk mengatur data terkait pembayaran.
 * Kelas ini merupakan Subclass dari kelas Invoice.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22-04-2021
 */
public class BankPayment extends Invoice {
    // Deklarasi beberapa instance variables yang akan digunakan.
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor pertama untuk object dari class BankPayment
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param jobs merupakan nilai inputan untuk variable jobs
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     */
    public BankPayment(int id, ArrayList<Job> jobs,  Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    /**
     * Constructor kedua untuk object dari class BankPayment
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param jobs merupakan nilai inputan untuk variable jobs
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     * @param adminFee merupakan nilai inputan untuk variable adminFee
     */
    public BankPayment(int id, ArrayList<Job> jobs,Jobseeker jobseeker, int adminFee) {
        super(id, jobs,  jobseeker);
        this.setAdminFee(adminFee);
    }

    /**
     * Method getter (accessor) yang bernama getPaymentType, berfungsi untuk mengambil nilai PAYMENT_TYPE.BankPayment
     *
     * @return PAYMENT_TYPE mengembalikkan nilai dari variable tersebut yaitu PAYMENT_TYPE.BankPayment
     */
    @Override
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE; 
    }

    /**
     * Method getter (accessor) yang bernama getAdminFee, berfungsi untuk mengambil isi nilai variable adminFee
     *
     * @return adminFee mengembalikkan nilai variable adminFee
     */
    public int getAdminFee() {
        return adminFee; 
    }

    /**
     * Method setter (mutator) yang bernama setAdminFee, berfungsi untuk mengisi nilai variable adminFee
     *
     * @param adminFee digunakan sebagai inputan untuk variable adminFee
     */
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    /**
     * Method setter (mutator) yang bernama setTotalFee, berfungsi untuk mengisi value totalFee
     *
     */
    @Override
    public void setTotalFee() {
        for(Job job : getJobs()){
            if(adminFee > 0) {
                super.totalFee = job.getFee() - getAdminFee();
            } else {
                super.totalFee = job.getFee();
            }
        }
    }

    /**
     * Method toString, berfungsi untuk mencetak (print) instance variable ke layar.
     * Ketika Objek atau kelas ini dipanggil untuk di print, maka hasil printnya akan sebuah pesan yang berisikan semua data instance variable.
     *
     * @return res menampilkan atau print data instance variable ke layar
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if (adminFee != 0) {
                res.concat("Id = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = "
                        + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res.concat("Id = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus()
                        + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
}