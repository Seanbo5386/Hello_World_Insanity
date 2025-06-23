package com.example.helloworldenterprise.domain.factory;

import com.example.helloworldenterprise.domain.builder.GreetingBuilder;
import com.example.helloworldenterprise.domain.entity.Greeting;
import org.springframework.stereotype.Component;

/**
 * Factory responsible for creating {@link Greeting} domain objects.
 */
@Component
public class GreetingFactory {

    /**
     * Create a {@link Greeting} with the provided message.
     *
     * @param message the greeting message
     * @return a new Greeting instance
     */
    public Greeting createGreeting(String message) {
        return new GreetingBuilder()
                .withMessage(message)
                .build();
    }
}
