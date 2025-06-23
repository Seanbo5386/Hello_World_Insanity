package com.example.helloworldenterprise.application.service;

import com.example.helloworldenterprise.application.queries.GetGreetingQuery;
import com.example.helloworldenterprise.application.queries.GetGreetingQueryHandler;
import com.example.helloworldenterprise.domain.entity.Greeting;
import com.example.helloworldenterprise.exception.GreetingNotFoundException;
import com.example.helloworldenterprise.presentation.dto.GreetingResponse;
import com.example.helloworldenterprise.presentation.mapper.GreetingMapper;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final GetGreetingQueryHandler handler;
    private final GreetingMapper mapper;

    public GreetingServiceImpl(GetGreetingQueryHandler handler, GreetingMapper mapper) {
        this.handler = handler;
        this.mapper = mapper;
    }

    @Override
    public GreetingResponse getGreeting(Locale locale) {
        Greeting greeting = handler.handle(new GetGreetingQuery(locale))
                .orElseThrow(() -> new GreetingNotFoundException("Greeting not found"));
        return mapper.toDto(greeting);
    }
}
