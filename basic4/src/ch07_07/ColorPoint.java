package ch07_07;

public class ColorPoint extends Point {

	String color;
	
	Point p = new Point();
	
	
	void colorPoint() {
		System.out.print(getColor() + "("+ p.getX() +", " + p.getY() +")");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	


}
