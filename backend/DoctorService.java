package com.clinic.service;

import com.clinic.model.Doctor;
import com.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<String> getAvailableSlots(Long doctorId, String date) {
        return List.of("10:00 AM", "11:00 AM", "2:00 PM", "4:00 PM");
    }

    public boolean validateDoctorLogin(String email, String password) {
        return doctorRepository.findByEmailAndPassword(email, password).isPresent();
    }
}
