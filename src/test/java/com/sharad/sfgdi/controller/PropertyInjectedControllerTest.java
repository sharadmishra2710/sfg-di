package com.sharad.sfgdi.controller;

import com.sharad.sfgdi.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller =new PropertyInjectedController();
        controller.greetingService=new PropertyGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}