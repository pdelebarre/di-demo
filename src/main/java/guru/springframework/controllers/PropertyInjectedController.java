package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {
// THING NOT TO DO !!!
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; //this is a trick, bean name matching implementation class name!!! but overridden if primary annotation set

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }



}