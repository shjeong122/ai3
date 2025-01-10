package payproject;

public class Employee {
	public String name;
	public String sno;
	
	public Employee() {}  //기본생성자
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: " + name + ", 사원번호: " + sno;
	}
	public long earnings() {
		// TODO Auto-generated method stub
		return 0L;

	}
}
