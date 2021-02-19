package similate.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getGermanGreeting() {
        return "Halt!  Commindine.  All spice.";
    }

    @Override
    public String getEnglishGreeting() {
        return "They came in the same old way, and we beat them in the same old way.";
    }

    @Override
    public String getSpanishGreeting() {
        return "My name is Inogo Montoya.  You killed my father. Prepare to die.";
    }
}
