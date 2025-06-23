package com.example.helloworldenterprise.exception;

import java.util.Locale;

public class GreetingNotFoundException extends RuntimeException {

    public GreetingNotFoundException(Locale locale) {
        super("Greeting not found for locale: " + locale);
    }
}
