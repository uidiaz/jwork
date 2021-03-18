/**
 * Merupakan class untuk Recruiter yang dapat menambah informasi perekrut.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 18 Maret 2021
 */

public class Recruiter
{

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;

    }

    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
          
    public String getEmail()
    {
        return email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public Location getLocation()
    {
        return location;
    }

    public void setid(int id)
    {
        this.id = id;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public void printData()
    {
        System.out.println(getName());
    }

}
