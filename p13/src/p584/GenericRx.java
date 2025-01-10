package p584;

public class GenericRx {

	public static void main(String[] args) {
		
		 boolean result1 = compare(10,20);
		 System.out.println(result1);
		 System.out.println();
		 
		 boolean result2 = compare(4.5,4.5);
		 System.out.println(result2);
		 System.out.println();

		 result2 = compare(4.5f,4.3f);
		 System.out.println(result2);
		 System.out.println();
		 
//		 result2 = compare(4.5L, 4.5L);
//		 System.out.println(result2);
//		 System.out.println();
		 
		 /*  result2 = compare('a','b');
		 System.out.println(result2);
		 System.out.println(); 
		 
		 result2 = compare("a","b");
		 System.out.println(result2);
		 System.out.println(); */    //<T extends Number> 선언으로 Number의 상속받은 타입만 가능
		 
		 
	}
			       //제네릭설정설명 제네릭	리턴타입	메소드
//	private static <T extends Number> boolean compare(T t1, T t2) {
//		System.out.println("compare(" + t1.getClass().getSimpleName() + "," + t2.getClass().getSimpleName() + ")");
//		return false;
//	}
	private static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass() + "," + t2.getClass().getSimpleName() + ")");
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return false;
	}

}
