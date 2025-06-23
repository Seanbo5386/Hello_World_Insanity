package com.example.helloworldenterprise.infrastructure.repository;

import com.example.helloworldenterprise.domain.entity.Greeting;
import com.example.helloworldenterprise.domain.factory.GreetingFactory;
import com.example.helloworldenterprise.domain.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

/**
 * Repository implementation that creates greetings based on configuration
 * properties. Messages are loaded once on construction and converted to
 * {@link Greeting} instances using {@link GreetingFactory}.
 */
@Repository
public class ConfigGreetingRepositoryImpl implements GreetingRepository {

    private final Map<Locale, Greeting> greetings = new HashMap<>();

    public ConfigGreetingRepositoryImpl(
            GreetingFactory factory,
            @Value("${greeting.english:Hello Config}") String english,
            @Value("${greeting.french:Bonjour Config}") String french,
            @Value("${greeting.german:Hallo Config}") String german) {
        greetings.put(Locale.ENGLISH, factory.createGreeting(english));
        greetings.put(Locale.FRENCH, factory.createGreeting(french));
        greetings.put(Locale.GERMAN, factory.createGreeting(german));
    }

    @Override
    public Optional<Greeting> findByLocale(Locale locale) {
        return Optional.ofNullable(greetings.get(locale));
    }
}
