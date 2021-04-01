
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
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Apart");
        Recruiter recruiter1 = new Recruiter(1, "Diaz", "diaz.ilyasa@ui.ac.id", "08117776666", location1);
        Job job1 = new Job(2, "Senior Designer", recruiter1, 22000, JobCategory.WebDeveloper);
        Jobseeker jobseeker1 = new Jobseeker(3, "Adam", "Adam.Adam@ui.ac.id", "passworddddd", "18 Maret 2021");
        Bonus bonus1 = new Bonus(11, "BonusPay", 10000, 30000, true);
        Bonus bonus2 = new Bonus(12, "BonusPay", 20000, 13000, true);

        EwalletPayment e1 = new EwalletPayment(1, job1, "13 Desember 2021", 24900, jobseeker1, InvoiceStatus.Finished);
        EwalletPayment e2 = new EwalletPayment(2, job1, "14 Desember 2021", 30990, jobseeker1, bonus1, InvoiceStatus.Finished);
        EwalletPayment e3 = new EwalletPayment(3, job1, "15 Desember 2021", 40099, jobseeker1, bonus2, InvoiceStatus.Finished);
        
        e1.printData();
        e2.printData();
        e3.printData();
    } 

}
