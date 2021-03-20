/**
 * Merupakan class untuk Recruiter yang dapat menambah informasi perekrut.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 18 Maret 2021
 */

public class Recruiter
{

    private int id;                 //variable id
    private String name;            //variable name
    private String email;           //variable email
    private String phoneNumber;     //variable phoneNumber
    private Location location;      //variable location
    
    /**
     * Untuk membuat objek baru
     @param id id perekrut
     @param name nama perekrut
     @param email email perekrut
     @param phoneNumber nomor hp perekrut
     @param location data dari class Location
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
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
     * Sebuah getter untuk mendapatkan data phoneNumber
     * @return objek phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Sebuah getter untuk mendapatkan data dari class Location
     * @return objek location
     */
    public Location getLocation()
    {
        return location;
    }

    /**
     * Sebuah setter untuk mengisi ulang id dari objek
     * @param id id dari perekrut
     */
    public void setid(int id)
    {
        this.id = id;
    }

    /**
     * Sebuah setter untuk mengisi ulang email dari objek
     * @param email email dari perekrut
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Sebuah setter untuk mengisi ulang nama dari objek
     * @param name nama dari perekrut
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sebuah setter untuk mengisi ulang nomor HP dari objek
     * @param phoneNumber nomor HP dari perekrut
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sebuah setter untuk mengganti data yang diambil dari class Location
     * @param location lokasi perekrut
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }

    /**
     * Untuk mengeprint data
     */
    public void printData()
    {
        System.out.println(getId());
        System.out.println(getName());  //print nama perekrut
        System.out.println(getEmail());
        System.out.println(getPhoneNumber());
        System.out.println(getLocation());
    }

}
