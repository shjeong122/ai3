package p763;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectEx {

	public static void main(String[] args) {
		System.out.println("============교재====================");
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));

		//남학생만 묶어 List 생성
		/* List<Student> maleList = totalList.stream()
				.filter(s ->s.getSex().equals("남"))
				.collect(Collectors.toList()); */
		
		List<Student> maleList = totalList.stream()
				.filter(s ->s.getSex().equals("남"))
				.toList();
		
		maleList.stream()
		.forEach(s->System.out.println(s.getName()));
		
		System.out.println();
		
		//학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
						Collectors.toMap(
							s->s.getName(), s->s.getScore()
							)
						);
		System.out.println(map);
		
		
		System.out.println("============선생님====================");
		//totalList.stream().filter(s->s.getSex().equals("남")).collect(Colletors.toList());
					
		//collector
		List<Student> maleList1 = totalList.stream()
				.filter(s ->s.getSex().equals("남"))
				.collect(Collectors.toList());
		System.out.println("collector maleList1.get(0) " + maleList1.get(0));
		System.out.println("collector maleList1.get(1) " + maleList1.get(1));
		
		//toList
		List<Student> maleList2 = totalList.stream()
				.filter(s ->s.getSex().equals("남"))
				.toList();
		System.out.println("collector maleList2.get(0) " +maleList2.get(0));
		System.out.println("collector maleList2.get(1) " +maleList2.get(1));
		

		
	
		//set_점수가 90점 이상인 학생
		//Set은 중복 불가, 동등객체Comparator 필요
		Set<Student> set = new HashSet<>(); 
		set.add(new Student("홍길동", "남", 92));
		set.add(new Student("김수영", "여", 87));
		set.add(new Student("감자바", "남", 95));
		set.add(new Student("오해영", "여", 93));
		set.add(new Student("오해영", "여", 93));
		
		//이름 기준_비교 제시
		System.out.println("===========================");
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("set " + it.next());
		}
		
		System.out.println("===========================");
		Set<Student> s90 = set.stream().filter(s->s.getScore() >= 90).collect(Collectors.toSet());
		it = s90.iterator();
		while(it.hasNext()) {
			System.out.println("set 90점 이상 " + it.next());
		}
		
		//학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		System.out.println("===========================");
		Map<String, Integer> map1 = 
				totalList.stream().collect(Collectors.toMap(s->s.getName(), s->s.getScore() ));
		Integer sscore = map1.get("감자바");
		System.out.println("이름가 키, 점수가 값: " + sscore);
		
		//학생 점수를 키, 학생 성별 값으로 갖는 Map 생성하기
        Map<Integer, String>  map2 = 
            totalList.stream().collect( Collectors.toMap(s->s.getScore(), s->s.getSex() ) );
        String ssex = map2.get(93);
        System.out.println("점수가 키, 성별이 값: " +  ssex );

				
	}
}

