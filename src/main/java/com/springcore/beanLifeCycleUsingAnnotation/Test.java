package com.springcore.beanLifeCycleUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// to define bean here and start annotation
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanLifeCycleUsingAnnotation/beanlife.xml");
		Example e1 = context.getBean("ex1",Example.class);  // another way of type casting
		System.out.println(e1);
		context.registerShutdownHook();   /// this is to call the destroy method
		//which is coming from AbstractApplicationContext
		
	}
	

}
