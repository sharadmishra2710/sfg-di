package com.sharad.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "gretting !!! cons inj";
    }
}
