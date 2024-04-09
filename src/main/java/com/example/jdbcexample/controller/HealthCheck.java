package com.example.jdbcexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/healthcheck")
    public HealthCheckReponse healthCheck() {
        var res = new HealthCheckReponse();
        res.setMessage("them bu lon qua");
        return res;
    }
}
