package com.reservation.services;

import com.reservation.model.Appointment;
import com.reservation.model.Doctor;
import com.reservation.repository.AppointmentRepository;
import com.reservation.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }
    public Appointment addAppointment(Appointment appointment){return appointmentRepository.save(appointment);}
}