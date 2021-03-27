
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceStatus
{
    OnGoing("On Going"), 
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String invoicestatus;
    
    InvoiceStatus(String invoicestatus){
        this.invoicestatus = invoicestatus;   
    }

    public String toString() {
        return invoicestatus;
    }
}
