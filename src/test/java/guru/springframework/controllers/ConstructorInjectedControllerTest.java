package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedContoller;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedContoller = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedContoller.sayHello());
    }
}