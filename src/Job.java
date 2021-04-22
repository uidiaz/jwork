/**
 * Merupakan class untuk Job yang dapat menambah informasi pekerjaan.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */

public class Job
{

    private int id;                 //variable id
    private String name;            //variable name
    private Recruiter recruiter;    //variable recruiter
    private int fee;                //variable fee
    private JobCategory category;   //variable category
    
    /**
     * Untuk membuat objek baru
     @param id id pekerjaan
     @param name nama pekerjaan
     @param recruiter data dari class Recruiter
     @param fee biaya pekerjaan
     @param category kategori pekerjaan
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee= fee;
        this.category = category;
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
     * Sebuah getter untuk mendapatkan data name
     * @return objek name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sebuah getter untuk mendapatkan data fee
     * @return objek fee
     */
    public int getFee()
    {
        return fee;
    }

    /**
     * Sebuah getter untuk mendapatkan data category
     * @return objek category
     */
    public JobCategory getCategory()
    {
        return category;
    }

    /**
     * Sebuah getter untuk mendapatkan data dari class Recruiter
     * @return objek recruiter
     */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }

    /**
     * Sebuah setter untuk mengisi ulang id dari objek
     * @param id id dari pekerjaan
     */
    public void setId(int id)
    {
       this.id = id;
    }

    /**
     * Sebuah setter untuk mengisi ulang nama dari objek
     * @param name nama dari pekerjaan
     */
    public void setName(String name)
    {
       this.name = name;
    }

    /**
     * Sebuah setter untuk mengganti data yang diambil dari class Recruiter
     * @param recruiter data objek dari class Recruiter
     */
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter;
    }

    /**
     * Sebuah setter untuk mengisi ulang biaya dari objek
     * @param fee biaya dari pekerjaan 
     */
    public void setFee(int fee)
    {
       this.fee = fee;
    }

    /**
     * Sebuah setter untuk mengisi ulang kategori dari objek
     * @param category kategori dari pekerjaan
     */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    
    @Override
    public String toString() {
        return "Id = " + getId() + "\nName = " + getName() + "\nRecruiter = " + getRecruiter().getName() + "\nCity= "
                + getRecruiter().getLocation().getCity() + "\nFee = " + getFee() + "\nCategory = " + getCategory();

    }
}
