package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message","ธนดล ไชยศิลา");
        model.addAttribute("studentId", "673380585-0");

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {

        model.addAttribute(
                "message",
                "This is About Page");

        return "about";
    }
}