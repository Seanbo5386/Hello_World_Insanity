package com.example.helloworldenterprise.domain.repository;

import com.example.helloworldenterprise.domain.entity.Greeting;

import java.util.Locale;
import java.util.Optional;

public interface GreetingRepository {
    Optional<Greeting> findByLocale(Locale locale);
}
