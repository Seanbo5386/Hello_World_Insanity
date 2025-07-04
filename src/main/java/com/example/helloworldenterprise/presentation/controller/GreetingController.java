package com.example.helloworldenterprise.presentation.controller;

import com.example.helloworldenterprise.application.service.GreetingService;
import com.example.helloworldenterprise.presentation.dto.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/greeting")
    public ResponseEntity<GreetingResponse> greeting(Locale locale) {
        GreetingResponse response = service.getGreetingByLocale(locale);
        return ResponseEntity.ok(response);
    }
}
