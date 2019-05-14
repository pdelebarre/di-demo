package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService=greetingService;
    }
}