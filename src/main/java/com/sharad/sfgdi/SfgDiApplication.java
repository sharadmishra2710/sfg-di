package com.sharad.sfgdi;

import com.sharad.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext cxt=SpringApplication.run(SfgDiApplication.class, args);
		System.out.println("----------------------i 18 n --------------------------------");
		I18nController i18nController=cxt.getBean("i18nController", I18nController.class);
		System.out.println(i18nController.getHello());
		System.out.println("--------------END -------i 18 n ------------------------------");
		MyController myController=cxt.getBean("myController", MyController.class);
		System.out.println("Main Started going to get data from context");
		System.out.println(myController.getHello());
		System.out.println("Done ");

		System.out.println("Property injection--------------------------------------------------------------- ");
		PropertyInjectedController propertyInjectedController
				= cxt.getBean("propertyInjectedController", PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Setter injection --------------------------------------------------------------- ");
		SetterInjectionController setterInjectionController
				= cxt.getBean("setterInjectionController", SetterInjectionController.class);
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("constructor injection --------------------------------------------------------------- ");
		ConstructorInjectionController constructorInjectionController
				= cxt.getBean("constructorInjectionController", ConstructorInjectionController.class);
		System.out.println(constructorInjectionController.getGreeting());



	}

}
