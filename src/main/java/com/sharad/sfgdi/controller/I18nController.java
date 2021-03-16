package com.sharad.sfgdi.controller;

import com.sharad.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello(){
        return this.greetingService.sayGreeting();
    }
}
