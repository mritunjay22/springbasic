package com.springcore.autowiringUsingXml;

public class Emp {
private Address address;   // this name address will be matched by xml name

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

public void setAddress(Address address) {
	this.address = address;
	System.out.println("Setter Injectionnnnn/.....");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
}
