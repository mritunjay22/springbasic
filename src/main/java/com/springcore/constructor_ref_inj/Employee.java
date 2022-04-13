package com.springcore.constructor_ref_inj;

public class Employee {
private int id;
private String name;
private Address addObject;
// Here this class is dependent on object of Address class
//First we need to define address class as bean and then during defining this bean we haVE TO inject using ref of Addresss class to this object


public Employee(int id, String name, Address addObject) {
	super();
	this.id = id;
	this.name = name;
	this.addObject = addObject;
}
void show() {
	System.out.print(id+"    "+name);
	System.out.print(addObject.toString());
	
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", addObject=" + addObject + "]";
}
public Address getAddress() {
	return addObject;
}






}
