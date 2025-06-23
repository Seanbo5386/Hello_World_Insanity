package com.example.helloworldenterprise.application.service;

import com.example.helloworldenterprise.presentation.dto.GreetingResponse;

import java.util.Locale;

public interface GreetingService {
    GreetingResponse getGreetingByLocale(Locale locale);
}
