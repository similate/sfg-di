package similate.springframework.sfgdi.controllers;

import similate.springframework.sfgdi.services.GreetingService;

// Least preferred
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
