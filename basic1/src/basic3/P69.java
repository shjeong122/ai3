package basic3;

import java.util.Scanner;

public class P69 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 123;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d 왼쪽정렬\n", value);
		System.out.printf("%06d\n", value);
		//System.out.printf("%-06d\n", value);

		Scanner sc = new Scanner(System.in);
		System.out.println("이름은?");
		String name = sc.nextLine();
		System.out.println(name);
		int age = sc.nextInt();
		System.out.println(age);
		System.out.println("왼쪽시력? ");
		double see = sc.nextDouble();
		System.out.println(see);
		System.out.println("성별은? 남:true, 여:false");
		boolean sex = sc.nextBoolean();
		if(sex) {
			System.out.println(sex + "남자");
		} else {
			System.out.println(sex + "여자");
		}
					
		
	}

}
