package ch07_07;

public class Point {
	
	int x;
	int y;
	
	void point() {
		System.out.println("(" + getX() + getY() + ")" );
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
