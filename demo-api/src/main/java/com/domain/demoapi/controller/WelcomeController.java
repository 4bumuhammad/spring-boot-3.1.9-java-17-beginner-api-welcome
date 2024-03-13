package com.domain.demoapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to Spring Boot Rest API | by Dhony Abu Muhammad.";
    }
}
