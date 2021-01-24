package similate.springframework.sfgdi;

import similate.springframework.sfgdi.controllers.ConstructorInjectedController;
import similate.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import similate.springframework.sfgdi.controllers.PropertyInjectedController;
import similate.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);
		String greeting = myController.sayHello();
		System.out.println(greeting);
		System.out.println("------- Properties -------");
		// fails until we tell Spring by the stereotype/decorator that it's a component
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		// Fails until you tell spring to inject the service, and what the service is
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("------- Setter -------");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("------- Constructor -------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
