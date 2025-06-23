package com.example.helloworldenterprise.domain.builder;

import com.example.helloworldenterprise.domain.entity.Greeting;

import java.util.UUID;

public class GreetingBuilder {
    private UUID id = UUID.randomUUID();
    private String message;

    public GreetingBuilder withMessage(String message) {
        this.message = message;
        return this;
    }

    public Greeting build() {
        return new Greeting(id, message);
    }
}
