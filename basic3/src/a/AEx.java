package a;

import a.aa.*;
import a.ab.*;
import b.ba.*;
import b.bb.*;
public class AEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa = new AA("홍길동") ;
		AB ab = new AB(20);
		BA ba = new BA("010-1234-5678");
		BB bb = new BB("서울");
		
		System.out.println("이름 : " + aa.getName());
		System.out.println("나이 : " + ab.getAge());
		System.out.println("폰번호 : " + ba.getPhone());
		System.out.println("주소 : " + bb.getAddress());
		
		BB bb2 = new BB("강동구");
		System.out.println(bb2.getAddress());
		//강동구 -> 강서구
		//bb2.address = "강서구"; //접근제한자가 private로 되어있어서 사용 불가
		
		
	}

}
