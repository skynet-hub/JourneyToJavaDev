package com.nowTech.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext myAppContext = SpringApplication.run(SpringDemoApplication.class, args);

		MessageService messageService = myAppContext.getBean(MessageService.class);

		System.out.println(messageService.Greetings());


	}

}
