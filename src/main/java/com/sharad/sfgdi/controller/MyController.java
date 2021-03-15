package com.sharad.sfgdi.controller;

import com.sharad.sfgdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello(){
        System.out.println(this.greetingService.sayGreeting());
        return "After Mycontroller";
    }

}
