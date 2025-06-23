package com.example.helloworldenterprise.domain.factory;

import com.example.helloworldenterprise.domain.entity.Greeting;

import java.util.UUID;

public class GreetingFactory {

    public Greeting createGreeting(String message) {
        return new Greeting(UUID.randomUUID(), message);
    }
}
