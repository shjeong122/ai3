package p757;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {

	public static void main(String[] args) {
		System.out.println("===============교재방법======================");
		List<Integer> list = new ArrayList<>();
		
		/*//예외발생
		 * double avg = list.stream()
		 * .mapToInt(Integer :: intValue)
		 * .average()
		 * .getAsDouble();
		 */
		
		//방법1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균 : " + optional.getAsDouble());
		}else {
			System.out.println("방법1_평균 : 0.0");
		}
		//방법2
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : " + avg);
		
		//방법3
		list.stream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(a->System.out.println("방법3_평균 : " + a));
	
		
		System.out.println("=============선생님 방법=================");
		//optional 클래스 _ 집계값이 없는 경우 대비
		//정수 배열
		int[] arr = {1,2,3,4,5};
		int[] arr1 = {};
		
		//isPresent
		OptionalDouble optional1 =  Arrays.stream(arr1).average();
				if(optional1.isPresent()) {
					System.out.println("방법1_평균 : " + optional1.getAsDouble() );
				}else {
					System.out.println("방법1_평균 : 0.0"); 
				}
				
		//orElse _ 아니면 찍으세요
		double optional2 =  Arrays.stream(arr1).average().orElse(0.0);
		System.out.println("방법2_없는 배열 평균(없으면 0.0 출력) : " + optional2); 
			
		optional2 =  Arrays.stream(arr).average().orElse(0.0);
		System.out.println("방법2_있는 배열 평균 : " + optional2);
		
		//ifPresent
		Arrays.stream(arr1).average()
				.ifPresent(a->System.out.println("방법3_없는 배열 평균(없으면 출력X) : " + a)); 
		
		Arrays.stream(arr).average()
		.ifPresent(a->System.out.println("방법3_있는 배열 평균 : " + a));
		

	}

}
