package com.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservation.services.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    private PatientService PatientService;

    @GetMapping(value = "/getAllPatients" , produces = "application/json")
    public ResponseEntity getAllPatients(){
        return ResponseEntity.ok(PatientService.getAllPatients());
    }
}
