package ch05;

public class P193 {

	public static void main(String[] args) {
		String x = args[0]; //'10'
		String y = args[1]; //'20'
		String z = args[1]; //'20'
		String z1 = args[1]; //'20'
		
		int sum = Integer.parseInt(x) + Integer.parseInt(y);
		System.out.println(sum);
		
		int sum1 = Integer.parseInt(x) + Integer.parseInt(y) + Integer.parseInt(z) + Integer.parseInt(z1);
		System.out.println(sum1);
	}

}
