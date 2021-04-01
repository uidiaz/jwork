/**
 * Merupakan class untuk Invoice untuk menambah informasi tagihan.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */

public abstract class Invoice
{
    private int id;                 //variable id
    // private int idJob;              //variable idJob
    private Job job;
    private String date;            //variable date
    protected int totalFee;           //variable totalFee
    private Jobseeker jobseeker;    //variable jobseeker
    // private PaymentType paymentType; 
    private InvoiceStatus invoiceStatus;

    /**
     * Untuk membuat objek baru
     * @param id id tagihan
     * @param idJob id pekerjaan dari tagihan 
     * @param date tanggal tagihan
     * @param totalFee total biaya tagihan
     * @param jobseeker data dari class Jobseeker
     */
    public Invoice(int id, Job job, String date,  Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        // this.idJob = idJob;
        this.job = job;
        this.date = date;
        // this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        // this.paymentType = paymentType;
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
    
    /**
     * Sebuah getter untuk mendapatkan data idJob
     * @return objek idJob
     *
     * public int getIdJob()
     * {
     *     return idJob;
     * }
     */

    public Job getJob()
    {
        return job;
    }

    /**
     * Sebuah getter untuk mendapatkan data date
     * @return objek date
     */
    public String getDate()
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
    
    /**
     * Sebuah setter untuk mengisi ulang idJob dari objek
     * @param idJobs id biaya tagihan
     *
     * public void setIdJobs(int idJobs)
     * {
     *     this.idJob = idJob;
     * }
     */

    public void setJob(Job job)
    {
        this.id = id;   
    } 
    
    /**
     * Sebuah setter untuk mengisi ulang tanggal dari objek
     * @param date id dari tagihan
     */
    public void setDate(String date)
    {
        this.date = date;
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

    /**
     * public void setPaymentType(PaymentType paymentType)
     * {
     *     this.paymentType = paymentType;
     * }
     */

    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * Untuk mengeprint data
     */
    public abstract void printData();
    
}
