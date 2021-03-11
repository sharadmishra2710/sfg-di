package com.sharad.sfgdi;

import com.sharad.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext cxt=SpringApplication.run(SfgDiApplication.class, args);
		MyController myController=cxt.getBean("myController", MyController.class);
		System.out.println("Main Started going to get data from context");
		System.out.println(myController.getHello());
		System.out.println("Done ");
	}

}
