/**
 * Merupakan class untuk Invoice untuk menambah informasi tagihan.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 25 Maret 2021
 */

public class Invoice
{
    private int id;                 //variable id
    private int idJob;              //variable idJob
    private String date;            //variable date
    private int totalFee;           //variable totalFee
    private Jobseeker jobseeker;    //variable jobseeker
    private PaymentType paymentType; 
    private InvoiceStatus status;

    /**
     * Untuk membuat objek baru
     @param id id tagihan
     @param idJob id pekerjaan dari tagihan 
     @param date tanggal tagihan
     @param totalFee total biaya tagihan
     @param jobseeker data dari class Jobseeker
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
     */
    public int getIdJob()
    {
        return idJob;
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

    public PaymentType getPaymentType()
    {
        return paymentType;
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
     */
    public void setIdJobs(int idJobs)
    {
        this.idJob = idJob;
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
    public void setTotalFee(int totalFee)
    {
        this.totalFee = totalFee;
    }

    /**
     * Sebuah setter untuk mengganti data yang diambil dari class Jobseeker
     * @param recruiter data objek dari class Jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker;
    }

    public void setPaymentType(PaymentType paymentType)
    {
        this.paymentType = paymentType;
    }

    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }

    /**
     * Untuk mengeprint data
     */
    public void printData()
    {
        System.out.println("===================== JOB =====================");
        System.out.println("ID:" + getId());
        System.out.println("ID Job:" + getIdJob());
        System.out.println("Date:" + getDate());
        System.out.println("Seeker:" + jobseeker.getName());
        System.out.println("Total Fee:" + getTotalFee());
        /**
         * System.out.println("Jobseeker:" + getJobseeker());
         */
        System.out.println("Status:" + getJobseeker());
    }
}
