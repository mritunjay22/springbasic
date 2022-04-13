package com.springcore.reference_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference_injection/Refrenceinjection.xml");
		 A a = (A)context.getBean("a_ref");
		 System.out.println(a.getX());
		 System.out.println(a.getOb().getY());    // here object of class b is injected into ob of class A 

	}

}
