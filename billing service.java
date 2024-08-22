package com.healthcare.services;

import com.healthcare.models.Invoice;
import com.healthcare.models.Patient;
import com.healthcare.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getInvoicesForPatient(Patient patient) {
        return invoiceRepository.findByPatient(patient);
    }

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    // Additional methods for invoice and payment management
}