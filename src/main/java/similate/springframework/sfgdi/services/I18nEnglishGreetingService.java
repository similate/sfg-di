package similate.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- English Greeting Service";
    }
}
