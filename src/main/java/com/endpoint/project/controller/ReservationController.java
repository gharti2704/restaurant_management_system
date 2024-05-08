package com.endpoint.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @PostMapping
    public String makeReservation() {
        // Implement the logic to make a reservation
        return "Reservation made";
    }
}