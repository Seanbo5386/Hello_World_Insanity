package com.example.helloworldenterprise.presentation.dto;

public class GreetingResponse {
    private final String message;

    public GreetingResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
