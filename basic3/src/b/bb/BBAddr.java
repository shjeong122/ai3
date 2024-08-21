package b.bb;

public class BBAddr {
	void m() {
		BB bb = new BB("강동구");
		System.out.println(bb.getAddress());
		//강동구 -> 강서
		bb.address = "강서구";
		//bb.score = 90;
		
	}
}
