package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
//put @Autowired in above of any methods(above Property , above Setter Injection , Above Constructor)    
//less code  , fast
public class Emp {
	//@Autowired   ABOVE PROPERTY
private Address address;   // this will Automatic Inject the address object in this class this is Annotation autowire
	// this is Direct Injection Method Autowire
	// if  address name of bean changes in XML then it will make no effect in this
	// but it Throws Exception when it find more than one bean of same type address and get confuse
	// no matter the bean name is matching with this variable name or not but it create problem when find nore than one bean with same type
	// it is using byType find method

@Autowired      // above Constructor
public Emp(Address address) {
	super();
	this.address = address;
	System.out.println("Inside Constructor");
}

public Address getAddress() {
	return address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
//@Autowired           ABOVE SETTER METHOD
public void setAddress(Address address) {
	this.address = address;
	System.out.println("Setter Injectionnnnn/.....");
	System.out.println("Setter Method.....");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
}
