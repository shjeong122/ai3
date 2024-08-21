package ch06;

public class Person {
	// 필드 = this = 현재 클래스 변수
	String name;
	String phone;
	String address;
	//메소드
	void namePrint() {
		System.out.println("이름은 " + name);
	}
	void addressPrint() {
		System.out.println("주소는 "+ address);
	}
	void phonePrint() {
		System.out.println("전화번호는 "+ phone);
	}
	//이름 전화번호 메소드
	void namePhonePrint() {
		System.out.println("이름은 " +name + ", 전화번호는 "+phone );
	}
	//이름 주소 메소드
	void nameAddPrint() {
		System.out.println("이름은 " +name + ", 주소는 "+address );
	}
	
	//이름 주소 전화번호
	void nameAddPhonePrint() {
		System.out.println("이름은 " +name + ", 주소는 "+address+ ", 전화번호는 "+phone);
	}
	//기본값
	Person(){
		name = "홍길동";
		address = "강동구 천호동";
		phone = "010-0000-0000";
	} 
	//이름 바꾸는 함수 _set
	// 이순신을 입력받아서 name필드로 넣어 준다.
	void setName(String name) {
		this.name = name;
	}
	void setAdd(String address) {
		this.address = address;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	//이름 출력하기(내보내기) get함수
	//이름 이순신을 호출한 곳으로 반환한다.
	public String getName() {
		return name;
		
		
	}
}
