package DiazIlyasaAS.jwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Kelas DatabaseJobseekerPostgre, berfungsi untuk mengatur semua operasi Database Jobseeeker pada PostgreSQL
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 20-06-2021
 */
public class DatabaseJobseekerPostgre {
    // Instance Variable
    private static Connection c = null;
    private static Statement stmt = null;

    /**
     * Method insertJobseeker digunakan untuk  menambahkan data jobseeker baru pada database
     *
     * @param jobseeker sebagai input untuk data atau objek jobseeker yang akan ditambahkan
     * @return objek jobseeker jika berhasil
     */
    public static Jobseeker InsertJobseeker(Jobseeker jobseeker) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            int id = jobseeker.getId();
            String name = jobseeker.getName();
            String email = jobseeker.getEmail();
            String password = jobseeker.getPassword();
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);

            Date date = cal.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date);

            String query = "INSERT INTO jobseeker (id, name, email, password, date)"
                    + "VALUES (" + id + ",'" + name + "','" + email + "','" + password + "','" + date1 + "');";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            return null;
        }
        return jobseeker;
    }
    /**
     * Method getter (accessor) yang bernama getLastJobseekerId, berfungsi untuk mendapatkan ID jobseeker terakhir dari database
     *
     * @return value yang berisi id terakhir dari jobseeker
     */

    public static int getLastJobseekerId() {
        int value = 0;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM jobseeker;");
            while (rs.next()) {
                value = rs.getInt("max");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return value;
    }

    /**
     * Method getter (accessor) yang bernama getJobseekerById, berfungsi untuk mendapatkan data jobseeker berdasarkan Id yang diinputkan
     *
     * @param id sebagai inputan id dari jobseeker yang ingin ditampilkan
     * @return value yang berisi informasi data jobseeker yang akan ditampilkan berdasarkan id yang telah diinputkan
     */
    public static Jobseeker getJobseekerById(int id) {
        Jobseeker value = null;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker WHERE id = " + id + "");
            while (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return value;
    }

    /**
     * Method removeJobseeker, berfungsi untuk  untuk menghapus data jobseeker tertentu dari database
     *
     * @param id digunakan untuk menghapus data jobseeker berdasarkan id yang diinputkan
     * @return boolean untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean removeJobseeker(int id) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            String query = "DELETE * FROM jobseeker WHERE id = \"+id+\";\"";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return true;
    }

    /**
     * Method getter (accessor) yang bernama getJobseekerLogin, berfungsi untuk mendapatkan data jobseeker berdasarkan credentials login
     *
     * @param emailInput sebagai inputan untuk data email
     * @param passwordInput sebagai inputan untuk data password
     * @return value yang berisi informasi data jobseeker yang akan ditampilkan berdasarkan credentials login (email dan password) yang telah diinputkan
     */
    public static Jobseeker getJobseekerLogin(String emailInput, String passwordInput) {
        Jobseeker value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker WHERE email = '" + emailInput + "' AND password = '" + passwordInput + "';");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return value;
    }

    /**
     * Method getter (accessor) yang bernama getJobseeker, berfungsi untuk menampilkan semua data jobseeker yang ada di Database
     *
     * @return objek atau semua data jobseekers jika berhasil
     */
    public static ArrayList<Jobseeker> getJobseeker() {
        ArrayList<Jobseeker> jobseekers = new ArrayList<>();
        Jobseeker value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
                jobseekers.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return jobseekers;
    }
}
