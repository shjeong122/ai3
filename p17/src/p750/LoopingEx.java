package p750;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopingEx {

	public static void main(String[] args) {
		int[] intArr =  {1, 2, 3, 4, 5};
		
		//잘못 작성한 경우
		Arrays.stream(intArr)  //오리지널 스트림 : 배열->stream
			.filter(a->a%2==0) //중간 스트림 : a 나누기 2 의 나머지가 0 이면 true, true만 통과
			.peek(n->System.out.println(n)); //중간 스트림 : peek 중간에 한번 찍기, 최종 처리가 없으므로 동작하지 않음(에러없음)
		
		//peek에 최종 스트림 연결
		IntStream i = Arrays.stream(intArr)  //오리지널 스트림 : 배열->stream
		.filter(a->a%2==0) //중간 스트림 : a 나누기 2 의 나머지가 0 이면 true, true만 통과
		.peek(n->System.out.println("peek : "+ n));
		i.forEach(n->System.out.println("forEach : " + n)); //최종 스트림 연결
		
		//홀수 평균 구하기
		double avg = Arrays.stream(intArr) //오리지널 스트림
						.filter(a->a%2==1) // 중간 스트림
						.average() //최종스트림, forEach사용 시 중간스트림까지 작성하여 변수에 담고, forEach와 average 각각 만들기
						.getAsDouble(); // + 기본형으로 바꾼 것
		System.out.println("홀수 평균은 ? : " + avg);
		
		//중간 처리 메소드 peek()을 이용해서 반복 처리
		int total = Arrays.stream(intArr)
						.filter(a->a%2==0)
						.peek(n->System.out.println(n))
						.sum(); //최종 처리
		System.out.println("총점 : " + total);
	
		//최종 처리 메소드 forEach()를 이용해서 반복 처리
		Arrays.stream(intArr)
			.filter(a->a%2==0)
			.forEach(n->System.out.println(n)); //최종 처리이므로 동작
			//.sum(); //최종 스트림 메소드이므로 forEach와 함께 사용 불가
		
				}
}
