package DiazIlyasaAS.jwork.controller;

import DiazIlyasaAS.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Kelas InvoiceController, berfungsi untuk mengatur (control) data invoice melalui Web API Service
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 22-05-2021
 */
@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    /**
     * Method getter (accessor) yang bernama getAllInvoice, berfungsi untuk menampilkan semua data invoice yang ada didalam database
     *
     * @return semua data invoice yang ada didatabase
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {
        return (DatabaseInvoice.getInvoiceDatabase());
    }

    /**
     * Method getter (accessor) yang bernama getInvoiceById, berfungsi untuk mendapatkan data invoice berdasarkan id nya
     *
     * @param id sebagai inputan id dari invoice yang akan ditampilkan
     * @return data invoice yang sesuai dengan id yang diinputkan
     */
    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    /**
     * Method getter (accessor) yang bernama getInvoiceByJobseeker, berfungsi untuk mendapatkan data invoice berdasarkan Id Jobseeker
     *
     * @param jobseekerId yaitu menggunakan inputan id jobseeker untuk menampilkan Invoice yang sesuai
     * @return data invoice yang sesuai dengan id jobseeker yang telah diinputkan
     */
    @RequestMapping("/Jobseeker/{JobseekerId}")
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerId) {
        ArrayList<Invoice> invoice = null;
        invoice = DatabaseInvoice.getInvoiceByJobseeker(jobseekerId);
        return invoice;
    }

    /**
     * Method changeInvoiceStatus, berfungsi untuk mengubah status dari invoice yang ada di dalam Database Invoice
     *
     * @param id sebagai inputan id untuk invoice yang akan diubah statusnya
     * @param status yaitu jenis status baru yang akan ditetapkan kepada status invoice lama yang akan diubah
     * @return data invoice yang berhasil diubah statusnya, sedangkan return null jika invoice yang ingin diubah statusnya tidak ada di database
     */
    @RequestMapping(value = "invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status){
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
            invoice.setInvoiceStatus(status);
            return invoice;
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
    }

    /**
     * Method removeInvoice, berfungsi untuk menghapus invoice yang ada pada Database Invoice
     *
     * @param id sebagai inputan id untuk invoice yang akan dihapus
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id) {
        try {
            DatabaseInvoice.removeInvoice(id);
            return true;
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Method addBankPayment, berfungsi untuk menambahkan data invoice baru dengan metode pembayaran (payment type) Bank Payment
     *
     * @param jobIdList sebagai inputan untuk id dari job
     * @param jobseekerId sebagai inputan untuk id dari jobseeker
     * @param adminFee sebagai inputan untuk data admin fee
     *
     * @return invoice jika invoice berhasil ditambahkan kedalam database, sedangkan return null atau data kosong jika invoice gagal ditambahkan ke database
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<>();
        for (Integer integer : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(integer));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }
        try {
            invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), adminFee);
            invoice.setTotalFee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean status = false;
        try {
            status = DatabaseInvoice.addInvoice(invoice);
        } catch (OnGoingInvoiceAlreadyExistException e) {
            e.printStackTrace();
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }

    /**
     * Method addEwalletPayment, berfungsi untuk menambahkan data invoice baru dengan metode pembayaran (payment type) Ewallet Payment
     *
     * @param jobIdList sebagai inputan untuk id dari job
     * @param jobseekerId sebagai inputan untuk id dari jobseeker
     * @param referralCode sebagai inputan untuk referral code bonus
     *
     * @return invoice jika invoice berhasil ditambahkan kedalam database, sedangkan return null atau data kosong jika invoice gagal ditambahkan ke database
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<>();
        for (Integer integer : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(integer));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }
        try {
            invoice = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByReferralCode(referralCode));
            invoice.setTotalFee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean status = false;
        try {
            status = DatabaseInvoice.addInvoice(invoice);
        } catch (OnGoingInvoiceAlreadyExistException e) {
            e.printStackTrace();
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }
}
