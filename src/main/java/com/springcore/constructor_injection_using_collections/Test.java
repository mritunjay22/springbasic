package com.springcore.constructor_injection_using_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_injection_using_collections/cons_collection_injection.xml");
		Question q1 = (Question)context.getBean("ques1");
		System.out.println(q1);

	}

}
