package com.sharad.sfgdi.controller;

import com.sharad.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }

}
