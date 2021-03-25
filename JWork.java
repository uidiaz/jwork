
/**
 * Write a description of class JWork here.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 25 Maret 2021
 */
public class JWork
{
    public static void main(String [] args) 
    { 
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Apart");
        Recruiter recruiter1 = new Recruiter(1, "Diaz", "diaz.ilyasa@ui.ac.id", "08117776666", location1);
        Job job1 = new Job(2, "Senior Designer", recruiter1, 22000, JobCategory.WebDeveloper);
        /** 
         * Jobseeker jobseeker1 = new Jobseeker(3, "Adam", "Adam.Adam@ui.ac.id", "passworddddd", "18 Maret 2021");
         * Invoice invoice1 = new Invoice(4, 5, "18 Maret 2021", 22000, jobseeker1);
         */
        
        job1.printData();
    } 

}
