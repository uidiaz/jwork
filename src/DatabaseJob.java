/**
 * Merupakan class untuk Database Job yang bisa menambah atau menghapus daftarnya.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22 April 2021
 */

import java.util.ArrayList;

public class DatabaseJob
{
    private static ArrayList<Job> JOB_DATABASE;
    private static int lastId = 0;


    /**
     * boolean untuk menambah pekerjaan
     * @return nilai yang berbeda
     */
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * boolean untuk menghapus pekerjaan
     * @return nilai yang berbeda
     */
    public static boolean remove(Job job){
        for (Job jobb : JOB_DATABASE) {
            if (job.getId() == jobb.getId()) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        return false;
    }

    /**
     * Sebuah getter untuk mendapatkan data Job
     * @return nilai kosong
     */
    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Job getJobById(int id){
        Job x = null;
        for (Job job : JOB_DATABASE) {
            if (id == job.getId()) {
                x = job;
            }
        }
        return x;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> x = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (category == job.getCategory()) {
                x.add(job);
            } else {
                return null;
            }
        }
        return x;
    }
}
