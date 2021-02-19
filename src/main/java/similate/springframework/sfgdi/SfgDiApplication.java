package similate.springframework.sfgdi;

import similate.springframework.sfgdi.controllers.*;
import similate.springframework.sfgdi.services.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		LifeCycleDemoBean lifeCycleDemoBean = (LifeCycleDemoBean) ctx.getBean("lifeCycleDemoBean");
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
		/*System.out.println("------- I18N Bean -------");
		I18NController i18nController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18nController.sayHello());*/
		System.out.println("------- Primary Bean -------");
		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayHello());
		System.out.println("------- Properties -------");
		// fails until we tell Spring by the stereotype/decorator that it's a component
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		// Fails until you tell spring to inject the service, and what the service is
		System.out.println(propertyInjectedController.sayHello());
		System.out.println("------- Setter -------");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("------- Constructor -------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
