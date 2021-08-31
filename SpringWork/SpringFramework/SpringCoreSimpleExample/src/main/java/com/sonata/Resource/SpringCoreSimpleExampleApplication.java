package com.sonata.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringCoreSimpleExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreSimpleExampleApplication.class, args);
		Person person = context.getBean(Person.class);
		System.out.println(getPersonInfo(person));
		
	}
	
	public static String getPersonInfo(Person person) {
		return "Name:" + person.getName() + "\n" + "Age:" + person.getAge() + "\n"
				+ "Height: " + person.getHeight() + "\n" + "Is Programmer?: "
				+ person.isProgrammer() + "\n" + "Address: "
				+ person.getAddress().getStreetNumber() + " "
				+ person.getAddress().getStreetName() + " "
				+ person.getAddress().getCity() + " "
				+ person.getAddress().getCountry();
	}

}
