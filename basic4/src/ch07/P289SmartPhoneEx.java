package ch07;

public class P289SmartPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P288Phone p1 = new P288Phone();
		p1.setModel("아이폰");
		p1.setColor("흰색");
		p1.bell();
		p1.sendVoice("안녕하세요");
		p1.recieveVoice("누구세요~");
		p1.hangup();
		//p1.setWifi(true); //자식멤버(필드,메소드) 사용 불가
		System.out.println();
		
		P288SmartPhone sp1= new P288SmartPhone();
		sp1.setModel("갤럭시");
		sp1.setColor("검정");
		System.out.println(sp1.getModel());
		System.out.println(sp1.getColor());
		sp1.bell();
		sp1.sendVoice("스마트폰으로 인사한 거야 안녕하세요~");
		sp1.recieveVoice("나도 스마트폰 누구세요~");
		sp1.hangup();
		sp1.setWifi(true); //자식멤버(필드,메소드) 사용 가능
		System.out.println();
		
		Tablet t1 = new Tablet() ;
		t1.setModel("태블릿");
		t1.setColor("은색");
		System.out.println(t1.getModel());
		System.out.println(t1.getColor());
		t1.bell();
		t1.sendVoice("태블릿으로 인사한 거야 안녕하세요~");
		t1.recieveVoice("나도 태블릿 누구세요~");
		t1.hangup();
		t1.setWifi(true);
	}

}