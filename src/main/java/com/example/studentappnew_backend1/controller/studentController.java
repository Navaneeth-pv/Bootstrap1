package com.example.studentappnew_backend1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
}
