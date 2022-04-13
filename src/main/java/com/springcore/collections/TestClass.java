package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/EmployeeConfig.xml");
		Employee ob1=(Employee)context.getBean("emp1");
//		System.out.print(ob1);  // its because of toString Method 
		System.out.print(ob1.getEmpName());
		System.out.println(ob1.getPhones());
		System.out.println(ob1.getCourses());
		System.out.print(ob1.getProb());
		

	}

}
