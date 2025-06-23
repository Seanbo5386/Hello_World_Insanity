package com.example.helloworldenterprise.application.queries;

import com.example.helloworldenterprise.domain.entity.Greeting;
import com.example.helloworldenterprise.domain.repository.GreetingRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetGreetingQueryHandler {

    private final GreetingRepository repository;

    public GetGreetingQueryHandler(GreetingRepository repository) {
        this.repository = repository;
    }

    public Optional<Greeting> handle(GetGreetingQuery query) {
        return repository.findByLocale(query.getLocale());
    }
}
