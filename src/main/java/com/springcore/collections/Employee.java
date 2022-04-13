package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.convert.Property;

public class Employee {
	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	private Properties prob;
	public Employee(String empName, List<String> phones, Set<String> address, Map<String, String> courses,
			Properties prob) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.prob = prob;
	}
	public Properties getProb() {
		return prob;
	}
	public void setProb(Properties prob) {
		this.prob = prob;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String empName, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	
	
	
	
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	

}
