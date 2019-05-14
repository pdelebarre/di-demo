package guru.springframework.controllers;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
// THING NOT TO DO !!!

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }



}