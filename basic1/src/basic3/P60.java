package basic3;

public class P60 {

	public static void main(String[] args) {
		// casting 연산=큰타입을 작은타입으로 넣을때 강제로 큰 타입을 작은 타입으로 바뀌 주는 것
		int a=10; //4byte
		byte b1; //1byte
		
		b1=(byte) a;
		System.out.println(b1);
		
		long a2=1000000L;  //long타입은 문자 끝에 L로 표기한다(기본 int)
		int a3;
		a3 =(int) a2;
		System.out.println(a3);
		
		double a4 = 3.556;
		float a5 = 12.456f;  //float는 문자 끝에 f로 표기한다(기븐 double)
		
		double dd;
		float ff;
		
		dd=a5; //double = float 자동형변환
		ff=(float)a4; //float = double
		System.out.println(dd + " " + ff);
		
		byte bb1, bb2, bb3;
		bb1 = 10;           //bite
		bb2 = 20;           //bite
		bb3 = (byte) (bb1 + bb2) ;  //+는 int이기 때문에 에러, 캐스트연산필요
		System.out.println(bb3);
		
		String str1 = "10";
		byte bstr1 =Byte.parseByte(str1);
		System.out.println(bstr1+200);  //연산
		System.out.println(str1+200);   //단순 단어의 나열
		
		String str2 = "30000";
		int iStr2=Integer.parseInt(str2);
		iStr2 = iStr2 + bstr1;
		System.out.println(iStr2);
		
		String str3 = "12.5f";
		//숫자로 만들기
		float fStr3 = Float.parseFloat(str3);
		//숫자 + 300 출력하기
		System.out.println(fStr3+300);
		
		String str4 = "78.964";
		double dStr4 = Double.parseDouble(str4);
		System.out.println(dStr4 + 300);
		
		String str5 = "true";
		boolean bStr5 = Boolean.parseBoolean(str5);
		System.out.println(bStr5 && true);
		
				
		

	}

}
