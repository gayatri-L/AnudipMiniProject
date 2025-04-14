package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Insert a new patient (CREATE)
    @PostMapping("/insert")
    public Patient insertPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    // Update an existing patient (UPDATE)
    @PostMapping("/update")
    public Patient updatePatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    // Delete all patients (DELETE)
    @PostMapping("/delete")
    public void deletePatients() {
        patientRepository.deleteAll();
    }

    // View all patients (READ)
    @GetMapping("/view")
    public List<Patient> viewPatients() {
        return patientRepository.findAll();
    }
}
