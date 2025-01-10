package p581;

public class GenericEx {
				//리턴타입     메소드명
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	public static void main(String[] args) {

		 Box<Integer> box1 = boxing(100);
		 int intValue = box1.getT();
		 System.out.println(intValue);
		
		 Box<String> box2 = boxing("홍길동");
		 String strValue = box2.getT();
		 System.out.println(strValue);
	
		 Box<Boolean> box3 = boxing(true);
		 Boolean boolValue = box3.getT();
		 System.out.println(boolValue);
		 
		 Box<Float> box4 = boxing(3.4f);
		 Float fValue = box4.getT();
		 System.out.println(fValue);
		 
			
		

	}

}
