package com.springcore.reference_injection;

public class A {
private int x;
private B ob;// here A is dependent on B
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}
public B getOb() {
	return ob;
}
public void setOb(B ob) {
	this.ob = ob;
}
@Override
public String toString() {
	return "A [x=" + x + ", ob=" + ob + "]";
}
}
