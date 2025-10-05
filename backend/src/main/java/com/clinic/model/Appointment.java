package com.clinic.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Future
    private LocalDateTime appointmentTime;

    private String status;

    // Getters and setters
}
