package p574;

public class GenericEx {

	public static void main(String[] args) {

		Box<Integer> box1 = new Box<>();
		box1.content = 10;
		//box1.content = "a"; //Type mismatch: cannot convert from String to Integer
		
		Box<String> box2 =  new Box<>();
		box2.content = "a";
		//box2.content = 10;  //Type mismatch: cannot convert from int to String
		
		Product<String, String> p1 = new Product<>();
		p1.setKind("과일");
		p1.setModel("포도");
		
		Product<Integer, Double> p2 = new Product<>();
		p2.setKind(1);
		p2.setModel(5.6);
		
		Product<Car, Hyundai> p3 = new Product<>();
		p3.setKind(new Car());
		p3.setModel(new Hyundai());
		System.out.println(p3.getKind()); //자동차
		System.out.println(p3.getModel()); //그랜저
		
		Product<Factory, Pants> p4 = new Product<>();
		p4.setKind(new Factory("공장"));
		p4.setModel(new Pants("바지"));
		System.out.println(p4.getKind().name); //공장
		System.out.println(p4.getModel().name); //바지

		HomeAgency h = new HomeAgency();
		Home home = h.rent();
		home.turnOnLight();
		
		CarAgency c = new CarAgency();
		Car car = c.rent();
		car.run();
		
		Box<String> box10 = new Box<>();
		box10.content = "100";
		
		Box<String> box11 = new Box<>();
		box11.content = "100";
		
		//box10과 box11의 내용물 비교
		//방법 1
		/* if(box10.content.equals(box11.content)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}*/
		//방법 2
		boolean result = box10.compare(box11); //box10안에 비교하는 메소드 compare를 만든다.
		System.out.println(result);
	}
	
}