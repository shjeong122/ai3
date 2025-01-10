package p746;

public class Student implements Comparable<Student> {
	//1. Student에 implements를 직접구현 : comparable
	//2. Student클래스와 상관없는 비교 클래스 구현 : comparator
	private String name;
	private int score;
	private int hakbun;
	
	public Student(String name, int score, int hakbun) {
		super();
		this.name = name;
		this.score = score;
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public int getHakbun() {
		return hakbun;
	}

	@Override
	public int compareTo(Student o) {
		//return hakbun - o.hakbun;
		return Integer.compare(hakbun, o.hakbun);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + score + " " + hakbun;
	}
}
