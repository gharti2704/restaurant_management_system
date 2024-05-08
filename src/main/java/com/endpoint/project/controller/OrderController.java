package com.endpoint.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestParam String deliveryOption) {
        // Implement the logic to place an order and select a delivery option
        return "Order placed with " + deliveryOption + " delivery";
    }
}