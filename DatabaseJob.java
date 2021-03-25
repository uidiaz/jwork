/**
 * Merupakan class untuk Database Job yang bisa menambah atau menghapus daftarnya.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 18 Maret 2021
 */
public class DatabaseJob
{
    private static String[] listJob;


    /**
     * boolean untuk menambah pekerjaan
     * @return nilai yang berbeda
     */
    public static boolean addJob(Job job)
    {
        return false;   
    }

    /**
     * boolean untuk menghapus pekerjaan
     * @return nilai yang berbeda
     */
    public static boolean removeJob(Job job)
    {
        return false;
    }

    /**
     * Sebuah getter untuk mendapatkan data Job
     * @return nilai kosong
     */
    public static Job getJob()
    {
        return null;
    }

    /**
     * Sebuah getter untuk mendapatkan data list dari Job
     * @return nilai kosong
     */
    public static String[] getListJob()
    {
        return listJob;
    }
}
