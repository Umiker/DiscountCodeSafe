package com.Discountsafe.LB_C.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Transient;

// Admin Login
@RestController
@RequestMapping("/login/admin")
public class AdminController {

    @GetMapping
    public String getMessage() {
        return "Admin Login";
    }
    // getter setter created admin in db
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}