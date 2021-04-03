
/**
 * Merupakan class untuk Bank Payment
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */
public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }
    
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker ,InvoiceStatus invoiceStatus, int adminFee)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }

    public PaymentType getPaymentType() 
    { 
        return PAYMENT_TYPE; 
    }

    public int getAdminFee() 
    { 
        return adminFee; 
    }
    
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }
    
    public void setTotalFee(){
        if (adminFee > 0) {
            totalFee = getJob().getFee() - adminFee;
        } else {
            totalFee = getJob().getFee();

        }
    }
    
    public void printData() 
    {
        System.out.println(
            "===================== INVOICE =====================" +
            "\nID: " + getId() +
            "\nJob: " + getJob().getName() +
            "\nDate: " + getDate() +
            "\nJob Seeker: " + getJobseeker().getName() +
            "\nAdmin Fee: " + adminFee +
            "\nFee: " + getTotalFee() +
            "\nStatus: " + getInvoiceStatus() +
            "\nPayment Type: " + PAYMENT_TYPE);
        
        
    }
}

