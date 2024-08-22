package com.healthcare.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private LocalDateTime datePaid;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    // Getters and Setters
}