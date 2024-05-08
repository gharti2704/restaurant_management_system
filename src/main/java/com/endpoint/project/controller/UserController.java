package com.endpoint.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public String createUser() {
        // Implement the logic to create a user
        return "User created";
    }

    @GetMapping
    public String getUser() {
        // Implement the logic to get a user
        return "User details";
    }
}