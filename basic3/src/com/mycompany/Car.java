package com.mycompany;

public class Car {
	String model;
	int price;
	
	public Car(String model, int price) {  //생성자
		super();
		this.model = model;
		this.price = price;
	}
	public String getModel() {  //getter
		return model;
	}
	public void setModel(String model) {  //setter
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}
