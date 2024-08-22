package com.healthcare.services;

import com.healthcare.models.Appointment;
import com.healthcare.models.Doctor;
import com.healthcare.models.Patient;
import com.healthcare.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAppointmentsForDoctor(Doctor doctor) {
        return appointmentRepository.findByDoctor(doctor);
    }

    public List<Appointment> getAppointmentsForPatient(Patient patient) {
        return appointmentRepository.findByPatient(patient);
    }

    public Appointment scheduleAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Additional methods for appointment management
}