package com.dailycodebuffer.managementApplication.controller;

import com.dailycodebuffer.managementApplication.model.EmployeeDetails;
import com.dailycodebuffer.managementApplication.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService userService;

    public EmployeeController(EmployeeService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }




    @PostMapping("/createUser")
    public String createUser(@ModelAttribute EmployeeDetails user, HttpSession session){
        boolean f = userService.checkEmail(user.getEmail());

        if(f){
            session.setAttribute("msg", "Email Id already exists");
        }else {
            EmployeeDetails employeeDetails = userService.createUser(user);
            if(EmployeeDetails != null) {
                session.setAttribute("msg", "Registration successful");
            }else {
                session.setAttribute("msg", "Something went wrong");
            }
        }

        return "redirect:/register";
    }
}
