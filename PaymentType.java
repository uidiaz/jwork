/**
 * Write a description of class PaymentType here.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 25 Maret 2021
 */

public enum PaymentType {
    BankPayment {
        @Override
        public String toString()
        {
            return "Bank Payment";
        }
    },
        
    EwalletPayment {
        @Override
        public String toString()
        {
            return "E-wallet Payment";
        }
    };
    
    public static void main(String[] args)
    {
        System.out.println(PaymentType.BankPayment);
        System.out.println(PaymentType.EwalletPayment);
    }
}