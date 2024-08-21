package ch0601;

public class Car {
	//p.228
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	public Car() {}
	
	public Car(String model) {
		this(model, "은색", 250);

	}

	public Car(String model, String color) {
		this(model, color, 250);
	}

	public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
}
