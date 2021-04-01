/**
 * Merupakan class untuk Jobseeker yang dapat menambah informasi pencari kerja.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */

public class Jobseeker
{
    private int id;             //variable id
    private String name;        //variable name
    private String email;       //variable email
    private String password;    //variable password
    private String joinDate;    //variable joinDate

    /**
     * Untuk membuat objek baru
     @param id id pencari kerja
     @param name nama pencari kerja
     @param email email pencari kerja
     @param password password pencari kerja
     @param joinDate tanggal bekerja dari pencari kerja
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
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
     * Sebuah getter untuk mendapatkan data email
     * @return objek email
     */      
    public String getEmail()
    {
        return email;
    }

    /**
     * Sebuah getter untuk mendapatkan data password
     * @return objek password
     */      
    public String getPassword()
    {
        return password;
    }

    /**
     * Sebuah getter untuk mendapatkan data joinDate
     * @return objek joinDate
     */      
     public String joinDate()
    {
        return joinDate;
    }

    /**
     * Sebuah setter untuk mengisi ulang id dari objek
     * @param id id dari pencari kerja
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Sebuah setter untuk mengisi ulang nama dari objek
     * @param name nama dari pencari kerja
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sebuah setter untuk mengisi ulang email dari objek
     * @param email email dari pencari kerja
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Sebuah setter untuk mengisi ulang password dari objek
     * @param password password dari pencari kerja
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * Sebuah setter untuk mengisi ulang joinDate dari objek
     * @param joinDate tanggal bekerja dari pencari kerja
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }

    /**
     * Untuk mengeprint data
     */
    public void printData()
    {
        System.out.println(
            "\nID: " + id +
            "\nName: " + name +
            "\nEmail: " + email +
            "\nPassword: " + password +
            "\nJoin Date: " + joinDate 
        );
    }
}