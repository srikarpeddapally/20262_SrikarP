package com.sonata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonata.one.Employee;
import com.sontata.two.Customer;

public class HelloMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");	
		Customer c1 = (Customer)context.getBean("cust");
		System.out.println(c1);
		
//		HelloService service=(HelloService) context.getBean("helloWorldService");
//		String message=service.sayHello();
//		System.out.println(message);
//		
//		//set a new name;
//		service.setName("spring");
//		message=service.sayHello();
//		System.out.println(message);
		
//		Employee e1 =(Employee)context.getBean("employee");
//		e1.display();
	}

}
