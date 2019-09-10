package com.Discountsafe.LB_C.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login/admin")
public class AdminController {

    @GetMapping
    public String getMessage() {
        return "Admin Login";
    }
}