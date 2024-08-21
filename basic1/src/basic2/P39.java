package basic2;

public class P39 {

	public static void main(String[] args) {
	// 39page
	byte b; //-128~127까지 정수표현
	b=(byte) -129;
	System.out.println(b);
	
	short s;
	s = (short) 32767;
	System.out.println(s);
	
	char c=98;
	System.out.println(c);
	
	int i = 210000;      //정수형의 기본
	System.out.println(i);
	
	long l = 80000000;
	System.out.println(l);
	
	byte b1, b2, b3;
	b1 = 100;
	b2 = 10;
	b3 = (byte) (b1 + b2);  //+-*/연산할때는 4bit의 int형으로 한다. 
					//   => 두 항을 같은 저장공간이 되도록 조정한
	System.out.println(b3);

	byte b4=100;
	short s4;
	s4=b4;  //2byte = 1byte
	b4=(byte) s4; 
	System.out.println(s4);

	int i1=2000;
	byte b7 =(byte) i1; //4byte =4byte
	System.out.println(b7);
	
	float f1 = 3.14f; //실수형 4byte
	int i2=100;
	f1 = i2; //4byte =4byte 실수=정수
  //i2 = f1; //4byte =4byte 정수=실수   실수>정수
	i2 = (int) f1; // or i2 type을 int->float 실수로 변경하여 실수 끼리의 계산으로 한다.
	
	float f2 = 1.1234567890f;  // 소수점 7번째까지 출력
	double d2 = 1.12345678901234567890; // 소수점 15번째까지 출력 
	System.out.println(f2 + " " + d2);
	
	double var3 = 3e6;
	System.out.println(var3);
	
	double var4 = .2e-3;
	System.out.println(var4);
	
	boolean ok = true;
	boolean no = false;
	System.out.println(ok && no);  //&& and
	System.out.println(ok || no);  //|| or
	
	
	String w="여러글자";
	char w1='ㅁ';
	String w2="a";
	System.out.println(w + " " + w1 + " " + w2);
	
	
	String str = "나는\"자바\"를 배웁니다.";
	System.out.println(str);
	
	str = "나는\'자바\'를 배웁니다.";
	System.out.println(str);
	
	str = "나는\\자바\\를 배웁니다.";
	System.out.println(str);
	
	str = "나는\t자바\t를 배웁니다.";
	System.out.println(str);
	
	str = "나는\n자바\n를 배웁니다.";
	System.out.println(str);
	
	str = "나는\r자바\r를 배웁니다.";
	System.out.println(str);
	
	str="""
			djlajf;'\''":|
			""";
	System.out.println(str);
	
	
		
	}
}
