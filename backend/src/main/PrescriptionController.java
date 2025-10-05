package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping
    public ResponseEntity<?> addPrescription(@RequestBody String prescription) {
        // Validate request
        if (prescription == null || prescription.isBlank()) {
            return ResponseEntity.badRequest().body("Invalid prescription details");
        }
        return ResponseEntity.ok("Prescription saved successfully!");
    }
}
