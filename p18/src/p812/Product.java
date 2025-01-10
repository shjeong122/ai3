package p812;

import java.io.Serializable;

public class Product implements Serializable {
	private String name;
	private int price;
	public static int field5=100;
	transient int field6;
	
	private static final long serialVersionUID = -1235468769L;
	public Product(String name, int price, int field5, int field6) {
		super();
		this.name = name;
		this.price = price;
		this.field6 = field6;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + price + " " + field5 + " " + field6 ;
	}
}
