package com.yourcompany;

public class CarName {
	String name;
	double tax;
	public String getName() {
		return name;
	}
	
	public CarName(String name, double tax) {
		super();
		this.name = name;
		this.tax = tax;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
