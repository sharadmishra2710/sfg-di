package com.sharad.sfgdi.controller;

import com.sharad.sfgdi.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller=new SetterInjectionController();
        controller.setGreetingService(new PropertyGreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}