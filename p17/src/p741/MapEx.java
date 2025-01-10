package p741;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("a", 85, 1.0),
											new Student("b", 95, 1.5),
											new Student("c", 100, 0.8)
										);
		list.stream().mapToInt( s->s.getScore() ).forEach(s->System.out.println(s));
		
		//시력 출력
		list.stream().mapToDouble(s->s.getEye()).forEach(s->System.out.println(s));
		//이름 출력
		list.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		
		
		//IntStream -> DoubleStream
		int[] intArray = {1,2,3,4,5};
		
		//List<int[]> list1 = Arrays.asList(intArray);
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(s->System.out.println(s));
		intStream = Arrays.stream(intArray);
		intStream.asLongStream().forEach(s->System.out.println(s));
		
		Stream <int[]> streamList= Stream.of(intArray);
		
		//DoubleStream -> IntStream 
		//불가 : 타입이 작아져서 안되
		
		double[] dA = {1.1, 2.2};
		DoubleStream ds = Arrays.stream(dA);
		
		//p743
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(s->System.out.println(s.intValue()));
		
		//p745
		//문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is a java");
		list1.add("i am a best developer");
		list1.stream()
			.flatMap(d -> Arrays.stream(d.split(" ")))
			.forEach(s->System.out.println(s));
		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30","40, 50");
		list2.stream()
			.flatMapToInt(d-> {
								String[] strArr = d.split(",");
								int[] intArr = new int[strArr.length];
								for(int i=0; i<strArr.length; i++) {
									intArr[i] = Integer.parseInt(strArr[i].trim());
											//trim : 공백 지우기
								}
								return Arrays.stream(intArr);
								})
			.forEach(s->System.out.println(s));
	}
}
