package com.healthcare.repositories;

import com.healthcare.models.Payment;
import com.healthcare.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByInvoice(Invoice invoice);
}