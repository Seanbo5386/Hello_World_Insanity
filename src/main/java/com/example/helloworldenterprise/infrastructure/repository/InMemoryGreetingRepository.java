package com.example.helloworldenterprise.infrastructure.repository;

import com.example.helloworldenterprise.domain.entity.Greeting;
import com.example.helloworldenterprise.domain.factory.GreetingFactory;
import com.example.helloworldenterprise.domain.repository.GreetingRepository;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class InMemoryGreetingRepository implements GreetingRepository {
    private final Map<Locale, Greeting> greetings = new HashMap<>();

    public InMemoryGreetingRepository(GreetingFactory factory) {
        greetings.put(Locale.ENGLISH, factory.createGreeting("Hello World"));
        greetings.put(Locale.FRENCH, factory.createGreeting("Bonjour le monde"));
        greetings.put(Locale.GERMAN, factory.createGreeting("Hallo Welt"));
    }

    @Override
    public Optional<Greeting> findByLocale(Locale locale) {
        return Optional.ofNullable(greetings.get(locale));
    }
}
