package DiazIlyasaAS.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Kelas JWork, merupakan kelas utama (main) untuk memulai program.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01-03-2021
 */
@SpringBootApplication
public class JWork {

    public static void main(String[] args) {

        Location location1 = new Location("DKI Jakarta", "Jakarta Utara", "Apartement");
        Location location2 = new Location("Aceh", "Banda Aceh", "Home");
        Location location3 = new Location("Jawa Barat", "Banda", "Vacation");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Diaz Ilyasa", "diaz.ilyasa@ui.ac.id", "08218705312", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Bill Gates", "bill.gates@ui.ac.id", "082129816423", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Mustofa Kamal", "mustofa.kamal@ui.ac.id", "082138927534", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Front End Developer", DatabaseRecruiter.getRecruiterById(1), 300000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(2, "UI Designer", DatabaseRecruiter.getRecruiterById(1), 100000, JobCategory.UI));
            DatabaseJob.addJob(new Job(3, "Back End Engineer", DatabaseRecruiter.getRecruiterById(2), 400000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(4, "Data Analyst", DatabaseRecruiter.getRecruiterById(3), 500000, JobCategory.DataAnalyst));
            DatabaseBonus.addBonus(new Bonus(1, "MICROSOFT", 100000, 1000, true));
        } catch (RecruiterNotFoundException | ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
        }

        //Testing Insert Data to PostgreSQL
        /*DatabaseJobseekerPostgre.addJobseeker(new Jobseeker(DatabaseJobseekerPostgre.getLastId() + 1, "Diaz", "diaz.ilyasa@ui.ac.id",
                "Mantab600", 2021, 3, 6));*/
        SpringApplication.run(JWork.class, args);
    }
}