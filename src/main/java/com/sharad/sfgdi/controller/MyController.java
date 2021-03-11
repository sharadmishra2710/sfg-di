package com.sharad.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getHello(){
        System.out.println("Hello method");
        return "Hello Sharad";
    }

}
