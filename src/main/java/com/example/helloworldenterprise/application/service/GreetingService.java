package com.example.helloworldenterprise.application.service;

import com.example.helloworldenterprise.presentation.dto.GreetingResponse;

import java.util.Locale;

public interface GreetingService {
    GreetingResponse getGreeting(Locale locale);

    /**
     * Retrieve a greeting for the provided locale. This method is the
     * preferred entry point for the presentation layer.
     *
     * @param locale the locale to fetch a greeting for
     * @return greeting DTO for the locale
     */
    default GreetingResponse getGreetingByLocale(Locale locale) {
        return getGreeting(locale);
    }
}
