package com.sharad.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "greetings !!PropertyGreetingServiceImpl";
    }
}
