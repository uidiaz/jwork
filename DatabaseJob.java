/**
 * Merupakan class untuk Database Job yang bisa menambah atau menghapus daftarnya.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 18 Maret 2021
 */
public class DatabaseJob
{
    private String[] listJob;


    public DatabaseJob()
    {
    }

    /**
     * boolean untuk menambah pekerjaan
     * @return nilai yang berbeda
     */
    public boolean addJob(Job job)
    {
        return false;   
    }

    /**
     * boolean untuk menghapus pekerjaan
     * @return nilai yang berbeda
     */
    public boolean removeJob(Job job)
    {
        return false;
    }

    /**
     * Sebuah getter untuk mendapatkan data Job
     * @return nilai kosong
     */
    public Job getJob()
    {
        return null;
    }

    /**
     * Sebuah getter untuk mendapatkan data list dari Job
     * @return nilai kosong
     */
    public String[] getListJob()
    {
        return null;
    }
}
