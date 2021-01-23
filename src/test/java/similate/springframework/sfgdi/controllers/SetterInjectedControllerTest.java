package similate.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import similate.springframework.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}