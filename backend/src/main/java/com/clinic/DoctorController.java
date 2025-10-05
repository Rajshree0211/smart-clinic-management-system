package com.clinic.controller;

import com.clinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{doctorId}/availability")
    public ResponseEntity<?> getDoctorAvailability(
            @PathVariable Long doctorId,
            @RequestParam String date,
            @RequestHeader("Authorization") String token) {
        // Validate token (you can use TokenService)
        return ResponseEntity.ok(doctorService.getAvailableSlots(doctorId, date));
    }
}
