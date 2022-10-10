package com.reservation.controllers;

import com.reservation.model.Doctor;
import com.reservation.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class DocWebController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping(value = "/doctors" , produces = "application/json")
    public String getAllDoctors(Model model){
        model.addAttribute("doctor",doctorService.getAllDoctors());
        return "doctor";
    }

    @GetMapping(value = "/findDoctorById/{employeeId}")
    public String findDoctorById(@PathVariable("employeeId")String employeeId, Model model){
        //ModelAndView mv = new ModelAndView();
        System.out.println("employeeId is:"+employeeId+" "+employeeId.getClass());
        Optional<Doctor> doctor = doctorService.getDoctorbById(Long.parseLong(employeeId));
        //mv.addObject("doctor",doctor.get());
        model.addAttribute("doctor",doctor.get());
        return "findDoctor";
    }

    @GetMapping(value = "/getDoctorById" , produces = "application/json")
    public String getDoctorById(Model model){
//        model.addAttribute("doctor",doctorService.getDoctorbById((Doctor)
//                model.getAttribute("doctor")));
        return "doctor";
    }

    @GetMapping(value = "/addDoctors" , produces = "application/json")
    public String addDoctor(Model model){
        Doctor doctor = new Doctor();
        model.addAttribute("doctor",doctor);
        return "addDoctor";
    }

    @PostMapping(value = "/addDoctor")
    public String addDoctor(@ModelAttribute Doctor doctor, Model model){
        //model.addAttribute("doctor",doctor);
        doctorService.addDoctor(doctor);
        return "doctor";
    }
}
