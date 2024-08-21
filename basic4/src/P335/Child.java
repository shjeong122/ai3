package P335;

public class Child extends Parent1{
	public  int studentNo; //멤버필드
	public String name; 
	
	public Child() { //생성자_생성자가 있으면 컴파일러가 기본생성자 자동생성하지 않는다.
		this("홍길동");
		System.out.println("Child() call");
	}
	public Child(String name) { //자식생성자 -> super()
		super();
		this.name = name ;
		System.out.println("Child(String name) call");	
	}
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
		
	}
	
}
