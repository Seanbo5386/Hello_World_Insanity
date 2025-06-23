package com.example.helloworldenterprise.domain.entity;

import java.util.UUID;

public class Greeting {
    private UUID id;
    private String message;

    public Greeting(UUID id, String message) {
        this.id = id;
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
