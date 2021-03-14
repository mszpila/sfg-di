package com.mszpila.sfgdi.controllers;

import com.mszpila.sfgdi.servies.GreetingService;

public class PropertyInjectedController{
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
