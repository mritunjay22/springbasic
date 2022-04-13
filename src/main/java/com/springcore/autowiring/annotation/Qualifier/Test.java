package com.springcore.autowiring.annotation.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/Qualifier/beanlife.xml");
       Emp e1= context.getBean("emp1",Emp.class);
      // Emp e2 = context.getBean("emp2",Emp.class);
      
       System.out.println(e1);// byName xml autowire is used
      
	}

}
