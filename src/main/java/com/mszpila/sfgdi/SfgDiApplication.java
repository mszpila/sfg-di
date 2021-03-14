package com.mszpila.sfgdi;

import com.mszpila.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		MyController myController1 = ctx.getBean("myController", MyController.class);

		System.out.println(myController.sayHello());
		System.out.println(myController1.sayHello());
	}

}
