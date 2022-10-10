package com.reservation.services;

import com.reservation.model.Doctor;
import com.reservation.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }
    public Doctor addDoctor(Doctor doctor){return doctorRepository.save(doctor);}
    public Optional<Doctor> getDoctorbById(Long employeeId){
        return doctorRepository.findById(employeeId);
    }

}

