package com.healthcare.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double amount;
    private LocalDateTime dateIssued;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany(mappedBy = "invoice")
    private List<Payment> payments;

    // Getters and Setters
}