
/**
 * Merupakan class untuk Jobseeker yang dapat menambah informasi pencari kerja.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


public class Jobseeker
{
    private int id;             //variable id
    private String name;        //variable name
    private String email;       //variable email
    private String password;    //variable password
    private Calendar joinDate;    //variable joinDate

    /**
     * Untuk membuat objek baru
     @param id id pencari kerja
     @param name nama pencari kerja
     @param email email pencari kerja
     @param password password pencari kerja
     @param joinDate tanggal bekerja dari pencari kerja
     */

    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        Calendar joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
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
     public Calendar getJoinDate()
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
    public void setEmail(String email){
        String regex = "\\A[a-z0-9!#$%&'*+/=?^_‘{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_‘{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\z";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }

    /**
     * Sebuah setter untuk mengisi ulang password dari objek
     * @param password password dari pencari kerja
     */
    public void setPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }

    /**
     * Sebuah setter untuk mengisi ulang joinDate dari objek
     * @param joinDate tanggal bekerja dari pencari kerja
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    @Override
    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\n";
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date + "\n";
        }
    }
}