package basic4;

public class P85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 변수
		int num1 = 100;
		int num2 = 200;
		
		num1++;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		System.out.println(num1 > num2);  //100<200, false
		System.out.println(num1 == num2); 
		System.out.println(num1 < num2);  //true
		System.out.println(num1 != num2);
		
		boolean ox = false;
		boolean ox2 = true;
		boolean ox3 = true;
		System.out.println(ox + " " + ox2); // false true
		System.out.println(!ox + " " + !ox2); // true false
		System.out.println(ox ^ ox2); //true
		System.out.println(ox2 ^ ox3); // false
		
		
		
	}

}
