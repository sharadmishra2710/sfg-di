package com.sharad.sfgdi.controller;

import com.sharad.sfgdi.service.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }

}
