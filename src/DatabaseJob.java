/**
 * Merupakan class untuk Database Job yang bisa menambah atau menghapus daftarnya.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22 April 2021
 */

import java.util.ArrayList;

public class DatabaseJob {

    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;
        for (Job job : JOB_DATABASE) {
            if (id == job.getId()) {
                temp = job;
                return temp;
            }
        }
        if (temp == null){
            throw new JobNotFoundException(id);
        }
        return temp;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (recruiterId == JOB_DATABASE.get(i).getRecruiter().getId()) {
                temp.add(JOB_DATABASE.get(i));
            } else {
                return null;
            }
        }
        return temp;

    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }

    /**
     * Method to add a new Job
     *
     * @param job
     * @return boolean value whether the Job addition is successful or not
     */
    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * Method to remove an existing Job
     *
     *
     * @return boolean value whether the Job removal is successful or not
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean status = false;
        for (Job job : JOB_DATABASE) {
            if (job.getId() == id) {
                JOB_DATABASE.remove(job);
                status = true;
                break;
            }
        }

        if (!status){
            throw new JobNotFoundException(id);
        }
        return false;
    }
}
