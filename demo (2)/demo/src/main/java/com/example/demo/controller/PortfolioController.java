package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    // ✅ Reusable method for student info
    private void addStudentAttributes(Model model) {
        model.addAttribute("studentName", "Jaymee Rose C. Bolisay");
        model.addAttribute("course", "BS Information Technology - 2nd Year");
        model.addAttribute("campus", "NEUST Peñaranda Off Campus");
    }

    // ✅ SINGLE ROUTE: All paths return the same index page
    @GetMapping({"/", "/home", "/about", "/journey", "/skills", "/gallery"})
    public String index(Model model) {
        addStudentAttributes(model);
        return "index";  // Returns templates/index.html
    }
}