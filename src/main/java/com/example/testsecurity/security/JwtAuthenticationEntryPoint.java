package com.example.testsecurity.security;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import java.io.IOException;
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        if(isPreAuthentication(request)){
            response.sendRedirect("/public/login");
        }
        else {
            response.sendRedirect("/public/error");
        }
    }
    private boolean isPreAuthentication(HttpServletRequest request) {

        // Implement your logic to check whether this is a pre-authentication request

        // You might check if there's no Authorization header or if the session is new

        // For example:

        return request.getHeader("Authorization") == null || request.getSession().isNew();

    }
}
