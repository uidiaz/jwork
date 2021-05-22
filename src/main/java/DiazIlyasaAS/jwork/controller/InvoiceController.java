package DiazIlyasaAS.jwork.controller;

import DiazIlyasaAS.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

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

    @RequestMapping("/Jobseeker/{JobseekerId}")
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerid) {
        ArrayList<Invoice> invoices = null;
        invoices = DatabaseInvoice.getInvoiceByJobseeker(jobseekerid);

        return invoices;
    }



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

    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value="jobs") ArrayList<Job> jobs,
                                  @RequestParam(value="jobseeker") Jobseeker jobseeker,
                                  @RequestParam(value="adminFee") int adminFee
    ) throws OnGoingInvoiceAlreadyExistException {
        Invoice invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, adminFee);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }
        catch(OnGoingInvoiceAlreadyExistException e){
            e.getMessage();
            return null;
        }
        return invoice;
    }


    @RequestMapping(value = "createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode) {
        Invoice invoice = null;
        ArrayList<Job> jobs = null;
        for(var i = 0; i < jobIdList.size(); i++) {
            try {
                jobs.add(DatabaseJob.getJobById(jobIdList.get(i)));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }
        try {
            invoice = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseeker.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByRefferalCode(referralCode));
            invoice.setTotalFee();
        } catch (JobSeekerNotFoundException e) {
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
