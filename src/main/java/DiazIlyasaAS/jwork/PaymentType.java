/**
 * Write a description of class PaymentType here.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01 Maret 2021
 */

package DiazIlyasaAS.jwork;

public enum PaymentType {
    BankPayment("Bank Payment"), 
    EwalletPayment("E-wallet Payment");
    
    private String paymenttype;
    
    PaymentType(String paymenttype){
        this.paymenttype = paymenttype;   
    }

    public String toString() {
        return paymenttype;
    }
}