package com.healthcare.repositories;

import com.healthcare.models.Invoice;
import com.healthcare.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByPatient(Patient patient);
}