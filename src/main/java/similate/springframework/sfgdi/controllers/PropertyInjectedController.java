package similate.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import similate.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Qualifier("greetingServiceImpl")
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
