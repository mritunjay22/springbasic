package com.springcore.constructor_ref_inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_ref_inj/constructor_ref_injection.xml");
		Employee eObject = (Employee)context.getBean("emp1");
		System.out.println(eObject);  // HERE DIRECTLY ACCESS OBJECT
		System.out.println(eObject.getAddress().getCountryCode());  // here we have to make a get object method of Address class in Employee class to get the all the methods of Address class
		System.out.println(eObject.getAddress().getCity());   // and like this with that Address Object we can access the Methods of Address class
		
		
		

	}

}
