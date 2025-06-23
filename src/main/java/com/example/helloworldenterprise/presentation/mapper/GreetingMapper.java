package com.example.helloworldenterprise.presentation.mapper;

import com.example.helloworldenterprise.domain.entity.Greeting;
import com.example.helloworldenterprise.presentation.dto.GreetingResponse;
import org.springframework.stereotype.Component;

@Component
public class GreetingMapper {

    public GreetingResponse toDto(Greeting greeting) {
        return new GreetingResponse(greeting.getMessage());
    }
}
