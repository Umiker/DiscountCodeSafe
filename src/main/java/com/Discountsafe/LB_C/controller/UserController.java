package com.Discountsafe.LB_C.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login/User")
public class UserController {

    @GetMapping
    public String getMessage() {
        return "User Login";
    }
}