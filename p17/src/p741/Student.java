package p741;

public class Student {
	private String name;
	private int score;
	private double eye; //시력
	
	public Student(String name, int score, double eye) {
		super();
		this.name = name;
		this.score = score;
		this.eye = eye;
	}
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public double getEye() {
		return eye;
	}

}
