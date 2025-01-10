package p12;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member("a1", "홍길동");
		Member m2 = new Member("a1", "홍길동");
		Member m3 = new Member("a2", "홍길동");
		Member m4 = new Member("a1", "김길동");

		//ID와 이름이 같으면 같은 사람
		//m1=m2
		//if((m1.getId().equals(m2.getId())) && (m1.getName().equals(m2.getName() )) ) {
	    //}
	 	//hashCode() 해시함수 : 메모리의 주소를 만들떄 주로 사용하는 함수
		
		m1.hashCodePrint();
		m2.hashCodePrint();
		m3.hashCodePrint();	
		m4.hashCodePrint();
		System.out.println();
		
		if(m1.hashCode() == m2.hashCode()) {
			System.out.println("m1과 m2는 동등객체이다_해시코드");
		}

		if(m1.equals(m2)) {
			System.out.println("m1 과 m2는 동등객체이다.");
		}
		if(m1.equals(m3)) {
			System.out.println("m1 과 m3는 동등객체이다.");
		}
		if(m1.equals(m4)) {
			System.out.println("m1 과 m4는 동등객체이다.");
		}
		if(m2.equals(m3)) {
			System.out.println("m2 과 m3는 동등객체이다.");
		}
		if(m2.equals(m4)) {
			System.out.println("m2 과 m4는 동등객체이다.");
		}
		if(m3.equals(m4)) {
			System.out.println("m3 과 m4는 동등객체이다.");
		}
	}
}
