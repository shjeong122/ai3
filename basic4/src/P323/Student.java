package P323;

public class Student extends Person {
	public int studentNo; //필드
	
	public Student(String name, int studentNo) { //생성자
		super(name); //부모호출
		this.studentNo = studentNo;
	}
	public void study() {
		System.out.println("공부를 합니다.");
	}

}
