package com.endpoint.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @GetMapping
    public String browseMenu() {
        // Implement the logic to browse the menu
        return "Menu";
    }
}