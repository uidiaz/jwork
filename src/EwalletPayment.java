import java.text.SimpleDateFormat;

/**
 * Merupakan class untuk Ewallet Payment
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */
public class EwalletPayment extends Invoice
{
    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, Bonus bonus ,InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }

    public PaymentType getPaymentType() 
    { 
        return PAYMENT_TYPE; 
    }

    public Bonus getBonus() 
    { 
        return bonus; 
    }
    
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }
    
    public void setTotalFee(){
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) {
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        } else {
            super.totalFee = getJob().getFee();

        }
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        System.out.println("===================== E-WALLET PAYMENT =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + date);
        System.out.println("Job Seeker: " + getJobseeker().getName());
        
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()){
            System.out.println("Referral Code: " + bonus.getReferralCode());
        }
        
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
        return "";
    }
}
