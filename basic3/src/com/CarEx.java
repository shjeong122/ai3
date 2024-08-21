package com;

//import com.mycompany.Car;
//import com.mycompany.Taxi;
//import com.yourcompany.CarName;
import com.mycompany.*; //해당 패키지 모든 클라스 사용
import com.yourcompany.*;

import a.aa.AA;
import a.ab.AB;

public class CarEx {

	public static void main(String[] args) {
		// 
		Car car1 = new Car("T100", 5000); // mycompany 
		CarName car2 = new CarName("소나타", 0.08); //yourcompany
		Taxi taxi = new Taxi(5);
		System.out.println(car1.getModel() + " " + car1.getPrice());
		System.out.println(car2.getName() + " " + car2.getTax());
		System.out.println("운행시간 : " + taxi.getRunTime());		
		
		AA aa = new AA("이순신");
		System.out.println(aa.getName());
		//aa.name = "최수진";  //오류발생 : name 변수는 default 접근 제한이기 때문에
		aa.setName("최수진");
		System.out.println(aa.getName());
		
		AB ab = new AB(30);
		System.out.println(ab.getAge());
		//30 -> 20
		//ab.age = 20; 접근 제한자가 default라서 사용 불가라서 다른 패키지 사용 불가
		// => public 만들거나, setter 사용(setter사용 선호)
		ab.setAge(20);
		System.out.println(ab.getAge());
		
		//BA ba = new BA("010-1234");
		
	}

}
