package com.example.helloworldenterprise.exception;

public class GreetingNotFoundException extends RuntimeException {
    public GreetingNotFoundException(String message) {
        super(message);
    }
}
