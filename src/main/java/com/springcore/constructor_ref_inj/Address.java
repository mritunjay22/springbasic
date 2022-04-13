package com.springcore.constructor_ref_inj;

public class Address {
private String city;
private String state;
private int countryCode;
public Address(String city, String state, int countryCode) {
	super();
	this.city = city;
	this.state = state;
	this.countryCode = countryCode;
	System.out.println("Constructor Injection");
	
	
	
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", countryCode=" + countryCode + "]";
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}
public int getCountryCode() {
	return countryCode;
}


}
