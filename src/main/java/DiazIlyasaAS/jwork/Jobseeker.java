package DiazIlyasaAS.jwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Kelas Jobseeker, dalam kelas ini terdapat beberapa method acessor (get) dan mutator (set).
 * Serta adanya sebuah method yang bertipe void untuk melakukan printData.
 * Sesuai dengan nama kelasnya (Jobseeker) yang berarti pencari kerja, sepertinya akan digunakan untuk mengatur segala data yang terkait dengan detail orang pencari kerja.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01-03-2021
 */
public class Jobseeker {
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /**
     * Sebuah Constructor yang bernama Jobseeker.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     * @param joinDate merupakan nilai inputan untuk variable joinDate
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    /**
     * Sebuah Constructor yang bernama Jobseeker.
     * Constructor ini menerapkan konsep polymorphism, karena mempunyai nama yang sama dengan constructor lain, namun mempunyai parameter yang berbeda.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     * @param year merupakan nilai inputan untuk variable year
     * @param month merupakan nilai inputan untuk variable month
     * @param dayOfMonth merupakan nilai inputan untuk variable dayOfMonth
     */
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     * Sebuah Constructor yang bernama Jobseeker.
     * Constructor ini menerapkan konsep polymorphism, karena mempunyai nama yang sama dengan constructor lain, namun mempunyai parameter yang berbeda.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     */
    public Jobseeker(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
    }

    /**
     * Sebuah method getter (accessor) yang bernama getId untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return id jadi mengembalikkan nilai yang ada didalam variable id
     */
    public int getId() {
        return id;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getName untuk mendapatkan/mengembalikkan data name.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return name jadi mengembalikkan nilai yang ada didalam variable name
     */
    public String getName() {
        return name;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getEmail untuk mendapatkan/mengembalikkan data email.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return email jadi mengembalikkan nilai yang ada didalam variable email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getPassword untuk mendapatkan/mengembalikkan data password.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return password jadi mengembalikkan nilai yang ada didalam variable password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getJoinDate untuk mendapatkan/mengembalikkan data joinDate.
     * Return type dari method ini adalah Calendar.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     *
     * @return joinDate jadi mengembalikkan nilai yang ada didalam variable joinDate
     */
     public Calendar getJoinDate() {
        return joinDate;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setId untuk menetapkan/mengisi nilai dari variable id.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu id.
     * Access modifier pada method berjenis public.
     *
     * @param id digunakan sebagai inputan untuk variable id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setName untuk menetapkan/mengisi nilai dari variable name.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu name.
     * Access modifier pada method berjenis public.
     *
     * @param name digunakan sebagai inputan untuk variable name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setEmail untuk menetapkan/mengisi nilai dari variable email.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu email.
     * Access modifier pada method berjenis public.
     *
     * @param email digunakan sebagai inputan untuk variable email
     */
    public void setEmail(String email) {
        String emailregex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(emailregex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            this.email = email;
        } else {
            this.email = "";
        }
    }

    /**
     * Sebuah method setter (mutator) yang bernama setPassword untuk menetapkan/mengisi nilai dari variable password.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu password.
     * Access modifier pada method berjenis public.
     *
     * @param password digunakan sebagai inputan untuk variable password
     */
    public void setPassword(String password) {
        String passregex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(passregex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()) {
            this.password = password;
        } else {
            this.password = "";
        }
    }

    /**
     * Sebuah method setter (mutator) yang bernama setJoinDate untuk menetapkan/mengisi nilai dari variable joinDate.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu joinDate.
     * Access modifier pada method berjenis public.
     *
     * @param joinDate digunakan sebagai inputan untuk variable joinDate
     */
    public void setJoinDate(Calendar joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * Sebuah method setter (mutator) yang bernama setJoinDate, dimana method ini menerapkan konsep polymorphism,
     * karena mempunyai nama yang sama dengan method sebelumnya, namun mempunyai parameter yang berbeda.
     * Access modifier pada method berjenis public.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini.
     *
     * @param year digunakan sebagai inputan untuk variable tahun (year)
     * @param month digunakan sebagai inputan untuk variable bulan (month)
     * @param dayOfMonth digunakan sebagai inputan untuk variable hari (day)
     */
    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Sehingga jika objek dipanggil maka akan mengembalikkan (return) sebuah data string yang sudah ditentukan.
     * Return type dari method bertipe String.
     * Access Modifier diatur public.
     *
     * @return id, name, email, password, date jadi mengembalikkan atau menampilkan semua data yang ada di instance variable jika variable joinDate tidak kosong, sedangkan return id, name, email, password jadi hanya mengembalikkan keempat data variable tersebut jika variable joinDate kosong.
     */
    @Override
    public String toString() {
    if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date;
        }
    }
}