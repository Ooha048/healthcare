package com.healthcare.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    // Getters and Setters
}