/**
 * Merupakan class untuk
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  06 Mei 2021
 */

package DiazIlyasaAS.jwork;

public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    public JobSeekerNotFoundException(int jobseeker_input) {
        super("Jobseeker ID: ");
        this.jobseeker_error = jobseeker_input;
    }

    public String getMessage() {
        return super.getMessage() + jobseeker_error + " not found";
    }

}