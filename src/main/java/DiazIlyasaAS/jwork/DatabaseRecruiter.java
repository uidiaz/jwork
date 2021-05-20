/**
 * Write a description of class DatabaseRecruiter here.
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22 April 2021
 */

package DiazIlyasaAS.jwork;
import java.util.ArrayList;

public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                temp = recruiter;
                return temp;
            }
        }
        if (temp == null) {
            throw new RecruiterNotFoundException(id);
        }
        return temp;
    }

    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean status = false;
        for (Recruiter element : RECRUITER_DATABASE) {
            if (element.getId() == id) {
                RECRUITER_DATABASE.remove(element);
                status = true;
                break;
            }
        }

        if (!status){
            throw new RecruiterNotFoundException(id);
        }
        return false;
    }
}
