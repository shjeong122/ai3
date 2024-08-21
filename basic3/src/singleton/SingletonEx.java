package singleton;

import java.util.Calendar;

public class SingletonEx {

	public static void main(String[] args) {
		 
		P276Singleton obj1 = P276Singleton.getInstance();
		System.out.println(obj1);
		
		P276Singleton obj2 = P276Singleton.getInstance();
		System.out.println(obj2);
		
		P276Singleton obj3 = P276Singleton.getInstance();
		System.out.println(obj3);
		
		Calendar.getInstance();
	}

}
