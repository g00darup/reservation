package com.reservation.controllers;

import com.reservation.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doctors")
public class DocWebController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping(value = "/getAllDoctors" , produces = "application/json")
    public String getAllDoctors(Model model){
        model.addAttribute("doctor",doctorService.getAllDoctors());
        return "doctor";
    }
}
