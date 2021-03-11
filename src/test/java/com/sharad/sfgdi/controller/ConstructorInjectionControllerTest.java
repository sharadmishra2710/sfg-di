package com.sharad.sfgdi.controller;

import com.sharad.sfgdi.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectionController(new PropertyGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}