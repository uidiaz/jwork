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

        System.out.println("=========Error===============");
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Diaz",
                    "diaz@ui.ac.id", "passW0rd123", 2021, 04, 22));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilyasa",
                    "diaz@ui.ac.id", "P4ssw0rd123", 2021, 04, 23));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Azrurrafi",
                    "azrurrafi@ui.ac.id", "Pa55w0rd123", 2021, 03, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Saiful",
                    "saiful@ui.ac.id", "p4sworD123", 2021, 03, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(101, "BreathItIn", 200000, 500000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(101, "BreathItIn", 200000, 500000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=========Database JobSeeker============");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());

        System.out.println("=========Database Bonus===============");
        System.out.println(DatabaseBonus.getBonusDatabase());


    }
}


        /**
            Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Apart");
            Recruiter recruiter1 = new Recruiter(1, "Diaz", "diaz.ilyasa@ui.ac.id", "08117776666", location1);
            Job job1 = new Job(2, "Senior Designer", recruiter1, 22000, JobCategory.WebDeveloper);
            Jobseeker jobseeker1 = new Jobseeker(3, "Adam", "Adam.Adam@ui.ac.id", "passworddddd", "18 Maret 2021");
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

             Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Apartment");
             DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Diaz", "diaz@ui.ac.id", "08116969696", location1));
             DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilyasa", "saiful@ui.ac.id", "Passw0rd", 2021, 04, 21));
             DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Azrurrafi", "azrurrafi@ui.ac.id", "p4SSw0rd", 2021, 04, 22));
             DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Saiful", "saiful@ui.ac.id", "pa55W0rD", 2021, 03, 1));

             DatabaseBonus.addBonus(new Bonus(1, "KAIA50", 1000, 500, false));
             DatabaseBonus.addBonus(new Bonus(2, "KAIA50", 1000, 500, true));



         */