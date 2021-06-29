package DiazIlyasaAS.jwork;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Kelas EwalletPayment berfungsi untuk mengatur data mengenai invoice yang menggunakan pembayaran dengan E-Wallet.
 * Kelas ini merupakan Subclass dari Kelas Invoice.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22-04-2021
 */

public class EwalletPayment extends Invoice {
    // Instance Variable
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor pertama untuk object dari class EwalletPayment
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param jobs merupakan nilai inputan untuk variable jobs
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    /**
     * Constructor kedua untuk object dari class EwalletPayment
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param jobs merupakan nilai inputan untuk variable jobs
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     * @param bonus merupakan nilai inputan untuk variable bonus
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus) {
        super(id, jobs, jobseeker);
        this.setBonus(bonus);
    }

    /**
     * Method getter (accessor) yang bernama getPaymentType, berfungsi untuk mengambil nilai PAYMENT_TYPE.EwalletPayment
     *
     * @return PAYMENT_TYPE mengembalikkan nilai dari variable tersebut yaitu PAYMENT_TYPE.EwalletPayment
     */
    @Override
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * Method getter (accessor) yang bernama getBonus, berfungsi sebagai untuk mengambil data yang ada didalam variable bonus
     *
     * @return bonus mengembalikkan isi dari variable bonus
     */
    public Bonus getBonus() {
        return bonus;
    }

    /**
     * Method setter (mutator) yang bernama setBonus, berfungsi untuk mengatur atau menset nilai dari variable bonus
     *
     * @param bonus digunakan sebagai inputan untuk variable bonus
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    /**
     * Method setter (mutator) yang bernama setTotalFee, berfungsi untuk mengisi value totalFee
     *
     */
    @Override
    public void setTotalFee() {
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs){
            int fee = job.getFee();
            if (bonus != null && (bonus.getActive() == true) && fee > bonus.getMinTotalFee()) {
                super.totalFee = fee + bonus.getExtraFee();
            } else {
                super.totalFee = fee;
            }
        }
    }

    /**
     * Method toString, berfungsi untuk mencetak (print) instance variable ke layar.
     * Ketika Objek atau kelas ini dipanggil untuk di print, maka hasil printnya akan sebuah pesan yang berisikan semua data instance variable.
     *
     * @return res mengembalikkan atau print data instance variable ke layar
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if ((bonus != null) && (bonus.getActive() == true) && (job.getFee() > bonus.getMinTotalFee())) {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nReferral Code = " + bonus.getReferralCode() + "\nTotal Fee = "
                        + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + bonus.getReferralCode() + "\nTotal Fee = "
                        + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
}
