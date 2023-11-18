package com.example.testsecurity.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("public")
@RequiredArgsConstructor
public class AuthenticationController {
    @GetMapping("/login")
    public String showLogin(){
        AuthenticationResponse response ;
        RegisterRequest registerRequest;
        AuthenticationRequest authenticationRequest;
        return "login";
    }
    @GetMapping("/error")
    public String showError(){
        return "error";
    }
}
