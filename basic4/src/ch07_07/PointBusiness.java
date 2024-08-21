package ch07_07;

public class PointBusiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.setX(1);
		p.setY(10);
		ColorPoint cp = new ColorPoint();
		cp.setColor("검정");
		System.out.println(cp.getColor() + "(" + p.getX() + ", " + p.getY() + ")");
		cp.colorPoint();
	}

}
