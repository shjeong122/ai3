package p765;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import p763.Student;

public class CollectEx {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("인사부", "남", 92));
		totalList.add(new Student("영업부", "여", 87));
		totalList.add(new Student("총무부", "남", 95));
		totalList.add(new Student("인사부", "여", 93));
		totalList.add(new Student("인사부", "남", 92));
		totalList.add(new Student("영업부", "여", 87));
		totalList.add(new Student("총무부", "남", 95));
		totalList.add(new Student("인사부", "여", 93));
		totalList.add(new Student("인사부", "남", 92));
		totalList.add(new Student("영업부", "여", 87));
		totalList.add(new Student("총무부", "남", 95));
		totalList.add(new Student("전산부", "여", 93));
		
		//남자끼리 모아서 Map으로 만들기
		Map <String, List <Student>> sexMap = 
				totalList.stream().collect(Collectors.groupingBy(s->s.getSex()));
		
		System.out.println(sexMap.get("남"));
		System.out.println(sexMap.get("여"));
		
		//부서별로 모아서 Map 만들기
		System.out.println("==================================");
		Map <String, List <Student>> dept = totalList.stream().collect(Collectors.groupingBy(s->s.getName()));
		System.out.println(dept.get("인사부"));
		System.out.println(dept.get("영업부"));
		System.out.println(dept.get("총무부"));
		
		//부서끼리 모아서 Map 만들기(키는 부서 값은 점수합계)
		Map<String, Integer> deptSum = totalList.stream()
				.collect(Collectors.groupingBy(s->s.getName(), Collectors.summingInt(s->s.getScore())));
		System.out.println("키는 부서, 값은 점수합계 : " + deptSum);
		System.out.println("키는 부서, 값은 점수합계_전산부 : " + deptSum.get("전산부"));
	
	}

}
