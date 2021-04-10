import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Merupakan class untuk Invoice untuk menambah informasi tagihan.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */

public abstract class Invoice
{
    private int id;                 //variable id
    private Job job;
    private Calendar date;            //variable date
    protected int totalFee;           //variable totalFee
    private Jobseeker jobseeker;    //variable jobseeker
    private InvoiceStatus invoiceStatus;

    /**
     * Untuk membuat objek baru
     * @param id id tagihan
     * @param idJob id pekerjaan dari tagihan 
     * @param date tanggal tagihan
     * @param totalFee total biaya tagihan
     * @param jobseeker data dari class Jobseeker
     */
    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.job = job;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * Sebuah getter untuk mendapatkan data id
     * @return objek id
     */
    public int getId()
    {
        return id;
    }
    

    public Job getJob()
    {
        return job;
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

    public void setJob(Job job)
    {
        this.id = id;   
    } 
    
    /**
     * Sebuah setter untuk mengisi ulang tanggal dari objek
     * @param date id dari tagihan
     */
    public void setDate(Calendar date)
    {
         this.date = Calendar.getInstance();
    }

    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
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
