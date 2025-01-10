package p712;

public class Member {
	public String name;
	
	public Member() { //기본생성자
		System.out.println("이곳은 생성자");
	}
	public Member(String name) { //명시적생성자, 매개변수가 있는 생성자
		System.out.println("이곳은 명시적생성자");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
