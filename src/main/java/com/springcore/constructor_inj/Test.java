package com.springcore.constructor_inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_inj/Constructor_inj.xml");
		 Person first = (Person)context.getBean("person1");
		 System.out.println(first);

	}

}
