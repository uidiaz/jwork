/**
 * Merupakan class untuk Invoice untuk menambah informasi tagihan.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22 April 2021
 */

package DiazIlyasaAS.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public abstract class Invoice
{
    private int id;                 //variable id
    private ArrayList<Job> jobs;
    private Calendar date;            //variable date
    protected int totalFee;           //variable totalFee
    private Jobseeker jobseeker;    //variable jobseeker
    private InvoiceStatus invoiceStatus;

    /**
     * Untuk membuat objek baru
     * @param id id tagihan
     * @param jobs id pekerjaan dari tagihan
     * @param date tanggal tagihan
     * @param totalFee total biaya tagihan
     * @param jobseeker data dari class Jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
    }

    /**
     * Sebuah getter untuk mendapatkan data id
     * @return objek id
     */
    public int getId()
    {
        return id;
    }
    

    public ArrayList<Job> getJobs()
    {
        return jobs;
    }

    /**
     * Sebuah getter untuk mendapatkan data date
     * @return objek date
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /**
     * Sebuah getter untuk mendapatkan data totalFee
     * @return objek date
     */
    public int getTotalFee()
    {
        return totalFee;
    }

    /**
     * Sebuah getter untuk mendapatkan data dari class Jobseeker
     * @return objek date
     */
    public Jobseeker getJobseeker()
    {
        return jobseeker;
    }

    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    /**
     * Sebuah setter untuk mengisi ulang id dari objek
     * @param id id dari tagihan
     */
    public void setId(int id)
    {
        this.id = id;   
    }

    public void setJobs(ArrayList<Job> jobs)
    {
        this.id = id;   
    } 
    
    /**
     * Sebuah setter untuk mengisi ulang tanggal dari objek
     * @param date id dari tagihan
     */
    public void setDate(Calendar date)
    {
         this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /**
     * Sebuah setter untuk mengisi ulang total biaya dari objek
     * @param totalFee totalFee dari tagihan
     */
    public abstract void setTotalFee();
    

    /**
     * Sebuah setter untuk mengganti data yang diambil dari class Jobseeker
     * @param recruiter data objek dari class Jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }

    public abstract String toString();
    
}
