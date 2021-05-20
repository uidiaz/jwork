/**
 * Write a description of class DatabaseRecruiter here.
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22 April 2021
 */

package DiazIlyasaAS.jwork;
import java.util.ArrayList;

public class DatabaseJobseeker
{
     private static final ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
     private static int lastId = 0;

     public static ArrayList<Jobseeker> getDatabaseJobseeker()
     {
          return JOBSEEKER_DATABASE;
     }

     public static int getLastId() {
          return lastId;
     }

     public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException{
          Jobseeker temp = null;
          for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
               if (id == jobseeker.getId()) {
                    temp = jobseeker;
                    return temp;
               }
          }
          if (temp == null){
               throw new JobSeekerNotFoundException(id);
          }
          return temp;
     }

     public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
          boolean result = false;
          for (Jobseeker js : JOBSEEKER_DATABASE) {
               if (jobseeker.getEmail() == js.getEmail()) {
                    throw new EmailAlreadyExistsException(jobseeker);
               }
          }
          JOBSEEKER_DATABASE.add(jobseeker);
          lastId = jobseeker.getId();
          return true;
     }

     public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException{
          boolean status = false;
          for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
               if (jobseeker.getId() == id) {
                    JOBSEEKER_DATABASE.remove(jobseeker);
                    status = true;
                    break;
               }
          }

          if (!status){
               throw new JobSeekerNotFoundException(id);
          }
          return false;
     }

     public static Jobseeker getJobseekerLogin(String email, String password){
          for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
               if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                    return jobseeker;
               }
          }
          return null;
     }
}
