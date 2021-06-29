package DiazIlyasaAS.jwork;

/**
 * Kelas FeeCalculator merupakan sebuah class yang digunakan untuk perhitungan total fee secara parallel ketika membuat invoice.
 * Kelas ini mengimplementasikan interface runnable
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 06-05-2021
 */
public class FeeCalculator implements Runnable{
    private Invoice invoice;

    /**
     * Method FeeCalculator, berfungsi untuk menampung data variable objek invoice
     *
     * @param invoice inputan untuk data atau objek invoice
     */
    public FeeCalculator (Invoice invoice){
        this.invoice = invoice;
    }

    /**
     * Method run, berfungsi untuk memulai proses kalkulasi total fee dari invoice, yang outputnya akan di print pada layar
     *
     */
    @Override
    public void run(){
        System.out.println("Calculating invoice id: " + invoice.getId());
        invoice.setTotalFee();
        System.out.println("Finished calculating invoice id: " + invoice.getId());
    }
}