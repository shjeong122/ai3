package p589;


public class ContainerEx {

	public static void main(String[] args) {
		// 2
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		
		//3
//		Container<Integer> container3 = new Container<Integer>();
//		container3.set("홍길동", "도적");
//		String name1 = container3.getKey();
//		String job = container3.getValue();
//		
//		Container<Integer> container4 = new Container<Integer>();
//		container4.set("홍길동", 35);
//		String name2 = container4.getKey();
//		int age = container4.getValue();
		
		
	}

}
