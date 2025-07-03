package com.example.VehicleServiceManagement.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Authentication authentication, Model model) {
        model.addAttribute("username", authentication.getName());
        return "home";  // home.html Thymeleaf template
    }
}
