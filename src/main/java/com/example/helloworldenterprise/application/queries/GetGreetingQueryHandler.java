package com.example.helloworldenterprise.application.queries;

import com.example.helloworldenterprise.application.service.GreetingService;
import com.example.helloworldenterprise.presentation.dto.GreetingResponse;
import org.springframework.stereotype.Component;

@Component
public class GetGreetingQueryHandler {

    private final GreetingService service;

    public GetGreetingQueryHandler(GreetingService service) {
        this.service = service;
    }

    public GreetingResponse handle(GetGreetingQuery query) {
        return service.getGreeting(query.getLocale());
    }
}
