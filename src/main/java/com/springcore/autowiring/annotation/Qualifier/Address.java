package com.springcore.autowiring.annotation.Qualifier;

public class Address {
	private String name;
	private int plotNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", plotNo=" + plotNo + "]";
	}
	

}
