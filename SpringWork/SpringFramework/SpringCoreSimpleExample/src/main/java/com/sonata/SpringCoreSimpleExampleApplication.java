package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringCoreSimpleExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreSimpleExampleApplication.class, args);
		Person person = context.getBean(Person.class);
		System.out.println(person);
		
	}

}
