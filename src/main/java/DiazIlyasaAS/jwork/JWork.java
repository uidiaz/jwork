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
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Az Saiful", "az.saiful@ui.ac.id", "082129816423", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Mil Fitus", "mil.fitus@ui.ac.id", "082138927534", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Backend Engineer 1", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Backend Engineer 2", DatabaseRecruiter.getRecruiterById(2), 30000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "Frontend Engineer 1", DatabaseRecruiter.getRecruiterById(3), 20000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(4, "Data Analyst 1", DatabaseRecruiter.getRecruiterById(3), 40000, JobCategory.DataAnalyst));
            DatabaseBonus.addBonus(new Bonus(1, "BONUSPAYMENT", 10000, 1000, true));
        } catch (RecruiterNotFoundException | ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
        }

        //Testing Insert Data to PostgreSQL
        /*DatabaseJobseekerPostgre.addJobseeker(new Jobseeker(DatabaseJobseekerPostgre.getLastId() + 1, "Diaz", "diaz.ilyasa@ui.ac.id",
                "Mantab600", 2021, 3, 6));*/
        SpringApplication.run(JWork.class, args);
    }
}