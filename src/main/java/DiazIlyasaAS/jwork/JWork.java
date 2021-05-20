/**
 * Write a description of class JWork here.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */

package DiazIlyasaAS.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {

        Location location1 = new Location("DKI Jakarta", "Jakarta Utara", "Apartement");
        Location location2 = new Location("Aceh", "Banda Aceh", "Home");
        Location location3 = new Location("Jawa Barat", "Banda", "Vacation");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Diaz Ilyasa", "diaz.ilyasa@ui.ac.id", "08218705312", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 2, "Az Saiful", "az.saiful@ui.ac.id", "082129816423", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Mil Fitus", "mil.fitus@ui.ac.id", "082138927534", location3));
        try {
            DatabaseJob.addJob(new Job(14, "Backend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(15, "Frontend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(16, "UI Engineer Solusimas", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.UI));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }
        SpringApplication.run(JWork.class, args);

    }

}