package basic5;

public class P117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = Math.random() ; //0.0<= 난수 <1.0 범위 내 규칙이 없는 수
		System.out.println(a);

		int b = (int)(Math.random()*6) ; //0<= 정수 <6 범위 내 정수
		System.out.println(b);
		
		int c= (int)(Math.random()*6)+1 ; //0<= 정수 <7 범위 내 정수
		System.out.println(c);

		int d = (int)(Math.random()*40)+10 ; //10<= 정수 <50 범위 내 정수
		System.out.println(d);
	}

}
