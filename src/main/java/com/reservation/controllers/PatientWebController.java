package com.reservation.controllers;

import com.reservation.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientWebController {
    @Autowired
    private PatientService PatientService;

    @GetMapping(value = "/getAllPatients" , produces = "application/json")
    public String getAllPatients(){

        return "patient";
    }
}
