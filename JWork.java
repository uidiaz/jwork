public class Jwork
{
    public void main(String [] args) 
    { 
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Apart");
        Recruiter recruiter1 = new Recruiter(1, "Diaz", "diaz.ilyasa@ui.ac.id", "08117776666", location1);
        Job job1 = new Job(1, "Diaz", recruiter1, 000, "New Recruit");
        Jobseeker jobseeker1 = new Jobseeker(1, "Diaz", "diaz.ilyasa@ui.ac.id", "passworddddd", "18 Maret 2021");
        Invoice invoice1 = new Invoice(1, 2, "18 Maret 2021", 2, jobseeker1);
        
    } 

}
