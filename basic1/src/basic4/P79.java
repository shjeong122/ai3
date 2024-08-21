package basic4;

import java.util.Scanner;

public class P79 {

	public static void main(String[] args) {
		
		int cnt = 0;
		for (int i=0; i<=10; i++) {
			//cnt=cnt+1, cnt+=1, cnt++
		cnt++;
		
		}
		System.out.println(cnt);  //11
		
		int n=10;
		System.out.println(n++);  //10 n=10  n+1=n
		System.out.println(n);    //11
		
		int b=100;
		System.out.println(++b);  //101  b=b+1
		System.out.println(b);    //101  b
		
		int c=20;
		int cc=c++;  // cc=20  c=c+1
		System.out.println(cc + " " +c);  //20 21
		
		int d=20;
		int dd=++d;  // d=d+1  d=21
		System.out.println(dd + " " +d);
		
		int e=10;
		e--;        //9
		System.out.println(e);
		
		int f=10;     //10
		System.out.println(f--);
		
		int g=10;     //9
		System.out.println(--g);
		//증감연산자 a++ 후위연산자 ++a전위연산자
		// + - * / %
		
		//overflow
		byte bb=10;
		//bb= -200; //underflow
		//bb= +200; //overflow
		
		//86
		int x = 5;
		int y = 0;
		//int result = x/y;
		//System.out.println(result);  //에러발생
		
		double y1 = 0.0;
		double result = x/y1;
		System.out.println(result);  //Infinity
		
		double y2 = 0.0;
		double result2 = x % y2;
		System.out.println(result2);  //NaN
		
		double y3 = 0.0;
		double result3 = x % y3;
		if (Double.isFinite(result)) {
		System.out.println("나눈 숫자가 0입니다.");
		}		
		System.out.println(result3); //0.0
		
		//키보드로 숫자 2개 입력받기
		//나눗셈 2번째 입력한 숫자가 0이면 
		//"다시 입력" 또는 "1로 나눌게요" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 1개 입력 : ");
		double num1 = sc.nextDouble();
		System.out.print("실수 1개 입력 : ");
		double num2 = sc.nextDouble();
		
		double result4 = num1/num2;
		System.out.println(result4);
		if( Double.isInfinite(result4)) {
			num2 = 1.0;
		}double result5 = num1/num2; 
		System.out.println(result5);	
		
		
		
		
		
		
		
		
		
		
		
	}

}
