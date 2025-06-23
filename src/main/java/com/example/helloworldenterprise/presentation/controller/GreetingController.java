package com.example.helloworldenterprise.presentation.controller;

import com.example.helloworldenterprise.application.queries.GetGreetingQuery;
import com.example.helloworldenterprise.application.queries.GetGreetingQueryHandler;
import com.example.helloworldenterprise.presentation.dto.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetingController {

    private final GetGreetingQueryHandler handler;

    public GreetingController(GetGreetingQueryHandler handler) {
        this.handler = handler;
    }

    @GetMapping("/greeting")
    public GreetingResponse greeting(Locale locale) {
        return handler.handle(new GetGreetingQuery(locale));
    }
}
