package DiazIlyasaAS.jwork;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Kelas DatabaseConnection, berfungsi untuk membuat koneksi dengan database pada server (PostgreSQL)
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 20-06-2021
 */
public class DatabaseConnection {

    /**
     * Method connection digunakan untuk konfigurasi database PostgreSQL yang digunakan
     *
     * @return c yaitu mengubungkan database dengan server (localhost)
     */
    public static Connection connection() {
        Connection c = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "beatsme85";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
