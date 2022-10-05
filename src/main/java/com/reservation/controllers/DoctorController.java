package com.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservation.services.DoctorService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping(value = "/getAllDoctors" , produces = "application/json")
    public ResponseEntity getAllDoctors(){
        return ResponseEntity.ok(doctorService.getAllDoctors());
    }
}

