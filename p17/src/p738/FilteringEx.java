package p738;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringEx {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("감자바");
		list.add("신용권");
		list.add("신용권");
		list.add("신민철");
		
		//중복 요소 제거
		list.stream().distinct().forEach(s->System.out.println(s));
		//신으로 시작하는 요소만 필터링
		list.stream().filter(s->s.startsWith("신")).forEach(s->System.out.println(s)); 
		//filter = test를 오버라이드한 함수
		
		////중복제거하고 마지막 글자가 '동'으로 끝나는 요소만 필터링
		list.stream().distinct().filter(s->s.endsWith("동")).forEach(s->System.out.println(s));
		
		Predicate p;		//함수적 인터페이스 = 추상메소드 1개 포함, boolean
	}

}
