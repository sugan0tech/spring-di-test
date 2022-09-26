package com.example.springditest;

import com.example.springditest.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiTestApplication.class, args);
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		System.out.println(greetingController.getGreeting());
	}

}
