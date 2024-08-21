package P335;

public class Parent1 {
	public String name;
	public String nation;
	
	public Parent1(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
}
	public Parent1() {
		this("대한민국"); //자신의 생성자 호출
		System.out.println("Parent() call");

		
	}
}
