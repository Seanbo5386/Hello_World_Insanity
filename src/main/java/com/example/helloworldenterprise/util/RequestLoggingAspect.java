package com.example.helloworldenterprise.util;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Aspect that logs incoming requests to the {@code GreetingController}.
 */
@Component
@Aspect
public class RequestLoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingAspect.class);

    @Pointcut("within(com.example.helloworldenterprise.presentation.controller.GreetingController)")
    public void greetingControllerMethods() {
        // Pointcut for GreetingController methods
    }

    @Before("greetingControllerMethods()")
    public void logRequest() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attrs != null) {
            HttpServletRequest request = attrs.getRequest();
            String method = request.getMethod();
            String uri = request.getRequestURI();
            String language = request.getHeader("Accept-Language");
            logger.info("Incoming request {} {} Accept-Language={}", method, uri, language);
        }
    }
}
