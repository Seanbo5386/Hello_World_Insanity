package com.example.helloworldenterprise.application.service;

import com.example.helloworldenterprise.domain.repository.GreetingRepository;
import com.example.helloworldenterprise.exception.GreetingNotFoundException;
import com.example.helloworldenterprise.presentation.dto.GreetingResponse;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GreetingServiceImpl implements GreetingService {
    private final GreetingRepository repository;

    public GreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public GreetingResponse getGreeting(Locale locale) {
        return repository.findByLocale(locale)
                .map(greeting -> new GreetingResponse(greeting.getMessage()))
                .orElseThrow(() -> new GreetingNotFoundException("Greeting not found"));
    }

    @Override
    public GreetingResponse getGreetingByLocale(Locale locale) {
        return getGreeting(locale);
    }
}
