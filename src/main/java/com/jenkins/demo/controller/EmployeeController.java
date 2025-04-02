package com.jenkins.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jenkins.demo.model.Employee;

@Controller
public class EmployeeController {

    @GetMapping("/employee-form")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    @PostMapping("/submit-employee")
    public String submitForm(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("message", "Employee " + employee.getName() + " registered successfully!");
        return "success"; // Create a success.html page to show the confirmation
    }
}
