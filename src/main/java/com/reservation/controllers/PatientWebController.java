package com.reservation.controllers;

import com.reservation.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PatientWebController {
    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/patients" , produces = "application/json")
    public String getAllPatients(Model model){
        model.addAttribute("patient",patientService.getAllPatients());
        return "patient";
    }
}
