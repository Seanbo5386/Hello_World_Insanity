package com.example.helloworldenterprise.domain.builder;

import com.example.helloworldenterprise.domain.entity.Greeting;

import java.util.UUID;

public class GreetingBuilder {
    private UUID id;
    private String message;

    /**
     * Specify the id to use for the created {@link Greeting}.
     *
     * @param id the identifier of the greeting
     * @return this builder instance
     */
    public GreetingBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Specify the greeting message.
     *
     * @param message the greeting message
     * @return this builder instance
     */
    public GreetingBuilder withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Build a new {@link Greeting} instance.
     * If no id has been provided, a random one is generated.
     *
     * @return the created Greeting
     */
    public Greeting build() {
        UUID greetingId = id != null ? id : UUID.randomUUID();
        return new Greeting(greetingId, message);
    }
}
