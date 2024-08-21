package P323;

public class InstanceofEx {
	// main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) { //Person호출
		System.out.println("name : " + person.name); //name 호출
		person.walk(); //walk메소드 호출
		
		System.out.println( person instanceof Person); 
		// person 주소로 Person 객체를 찾을 수 있는가? t/f
		System.out.println( person instanceof Student );
		// person 주소로 Student 객체를 찾을 수 있는가? t/f
		// person instanceof Student student 설명
		// person 주소로 Student객체를 찾을 수 있으면(true)이면 주소로 student 넣기
		
		if(person instanceof Student student) {
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		}
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		System.out.println();
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
		
}
}
