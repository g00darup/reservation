package com.reservation.services;

import com.reservation.model.Patient;
import com.reservation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    public Patient addPatient(Patient patient){return patientRepository.save(patient);}
    public Optional<Patient> getPatientbById(Patient patient){
        return patientRepository.findById(patient.getPatientId());
    }
}
