package com.springcore.beanLifeCycleUsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
private String subject;

public String getSubject() {
	return subject;
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@PostConstruct
public void start() {      //this annotation is used for init method
	System.out.println("init Starting Method");
}

@PreDestroy
public void end() {       //this annotation is used for Destroy method
	System.out.println("Destroy Method");
}

}
