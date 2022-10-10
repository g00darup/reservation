package com.reservation.controllers;

import com.reservation.model.Appointment;
import com.reservation.model.Doctor;
import com.reservation.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class AppointmentWebController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping(value = "/viewAppointment" , produces = "application/json")
    public String getAllDoctors(Model model){
        model.addAttribute("appointment",appointmentService.getAllAppointments());
        return "viewAppointment";
    }


    @GetMapping(value = "/addAppointments/{employeeId}" , produces = "application/json")
    public String addDoctor(@PathVariable("employeeId")String employeeId, Model model){
        Appointment appointment = new Appointment();
        //appointment.setDoctorId(Long.parseLong(employeeId));
        model.addAttribute("appointment",appointment);
        return "addAppointment";
    }

    @PostMapping(value = "/addAppointment")
    public String addDoctor(@ModelAttribute Appointment appointment, Model model){
        //model.addAttribute("doctor",doctor);
        appointmentService.addAppointment(appointment);
        return "viewAppointment";
    }

}


