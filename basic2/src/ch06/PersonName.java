package ch06;

public class PersonName {

	public static void main(String[] args) {
		// 객체화 시키기
		Person p = new Person();
		System.out.println(p);  //해쉬코드 16진수 코드 출력
		System.out.println(p.name + " " + p.address);
		p.nameAddPrint(); //함수호출 방법을 많이 사용한다.
		
		System.out.println(p.name + " " + p.phone);
		p.namePhonePrint();
		
		System.out.println(p.name + " " + p.address + " " + p.phone);
		p.nameAddPhonePrint();
		
		// 홍길동 -> 이순신
		p.name = "이순신";
		p.setName("이순신");
		p.namePrint();
		//주소 : 서울시 강남구 대치동 
		p.setAdd("서울시 강남구 대치동");
		p.addressPrint();
		//전화번호 010-1234-5678
		p.setPhone("010-1234-5678");
		p.phonePrint();
				
		//출력
		//1.
		System.out.println(p.name);
		//2. 함수호출
		System.out.println(p.getName());
		
		}
	}


//메소드
