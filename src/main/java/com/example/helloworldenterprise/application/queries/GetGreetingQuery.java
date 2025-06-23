package com.example.helloworldenterprise.application.queries;

import java.util.Locale;

public class GetGreetingQuery {
    private final Locale locale;

    public GetGreetingQuery(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }
}
