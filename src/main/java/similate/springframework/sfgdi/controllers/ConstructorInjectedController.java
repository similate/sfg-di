package similate.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import similate.springframework.sfgdi.services.GreetingService;

// Most preferred method
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    // Autowired is optional for constructor injection
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
