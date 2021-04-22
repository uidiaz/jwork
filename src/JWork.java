import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */
public class JWork
{
    public static void main(String [] args) 
    {

        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Apartment");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Diaz", "diaz@ui.ac.id", "08116969696", location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilyasa", "saiful@ui.ac.id", "Passw0rd", 2021, 04, 21));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Azrurrafi", "azrurrafi@ui.ac.id", "p4SSw0rd", 2021, 04, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Saiful", "saiful@ui.ac.id", "pa55W0rD", 2021, 03, 1));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(1, "Data Analyst", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.DataAnalyst));
        DatabaseJob.addJob(new Job(1, "Data Scientist", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataScientist));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));



        /**
            Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Apart");
            Recruiter recruiter1 = new Recruiter(1, "Diaz", "diaz.ilyasa@ui.ac.id", "08117776666", location1);
            Job job1 = new Job(2, "Senior Designer", recruiter1, 22000, JobCategory.WebDeveloper);
            // Jobseeker jobseeker1 = new Jobseeker(3, "Adam", "Adam.Adam@ui.ac.id", "passworddddd", "18 Maret 2021");
            Bonus bonus1 = new Bonus(11, "BonusPay", 20000, 10000, true);
            Bonus bonus2 = new Bonus(12, "BonusPay", 20000, 30000, true);



            Jobseeker jobseeker2 = new Jobseeker(1, "Name one", "diaz@ui.ac.id", "Passw0rd1", new GregorianCalendar(2000, 8, 15));
            Jobseeker jobseeker3 = new Jobseeker(2, "Name two", "diaz.ilyasa@ui.ac.id", "Passw0rd2", 2000, 4, 8);
            Jobseeker jobseeker4 = new Jobseeker(3, "Name three", "diasa@ui.ac.id", "Passw0rd3");

            EwalletPayment e1 = new EwalletPayment(1, job1, jobseeker2, InvoiceStatus.Finished);
            EwalletPayment e2 = new EwalletPayment(2, job1, jobseeker3, bonus1, InvoiceStatus.Finished);
            EwalletPayment e3 = new EwalletPayment(3, job1, jobseeker4, bonus2, InvoiceStatus.Finished);

            BankPayment bp1 = new BankPayment(8, job1, jobseeker2, InvoiceStatus.Finished);
            BankPayment bp2 = new BankPayment(9, job1, jobseeker3, InvoiceStatus.Finished, 9000);

            e1.setTotalFee();
            e2.setTotalFee();
            e3.setTotalFee();
            bp1.setTotalFee();
            bp2.setTotalFee();

            e1.toString();
            bp2.toString();
         */
    }

}
