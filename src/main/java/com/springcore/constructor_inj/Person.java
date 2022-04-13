package com.springcore.constructor_inj;

public class Person {
	//now here we are not goona use any getter /setter 
//	we will use constructor injection
private String personName;
private int personId;

public Person(String name,int personId) {
	//Param Constructor
	this.personName=name;
	this.personId=personId;
}

@Override
public String toString() {
	return this.personName+"  :  "+this.personId;
}


}
