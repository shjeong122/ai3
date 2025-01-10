package p746;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEx {

	public static void main(String[] args) {
		//Student implements Comparable
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30, 24));
		studentList.add(new Student("신용권", 10, 23));
		studentList.add(new Student("유미선", 20, 20));
		
		
		//학번 기준 오름차순 정렬
		studentList.stream()
					.sorted()
					.forEach(s->System.out.println(s));
		
		//학번 기준 내읾차순 정렬
		studentList.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(s->System.out.println(s));
		
		//Student2 Comparator 
		//Comparator 인터페이스의 추상메소드 int compare(T o1, T o2);
		List<Student2> student2List = new ArrayList<Student2>();
		student2List.add(new Student2("홍길동", 30, "1224"));
		student2List.add(new Student2("신용권", 10, "2323"));
		student2List.add(new Student2("유미선", 20, "3420"));
		
		//student2클래스 점수 오름차순 정렬
		student2List.stream()
					.sorted((o1, o2) -> Integer.compare(o1.getScore(), o2.getScore()))
					.forEach(s->System.out.println(s));
		
		//student2클래스 점수 내림차순 정렬
		student2List.stream()
					.sorted((o1, o2) -> Integer.compare(o2.getScore(), o1.getScore()))
					.forEach(s->System.out.println(s));
		
		//Student2 클래스 전화번호 오름차순 정렬
		student2List.stream()
					.sorted((o1, o2) -> o1.getPhone().hashCode() - o2.getPhone().hashCode())
					.forEach(s->System.out.println(s));
		
		//Student2 클래스 전화번호 내림차순 정렬
		student2List.stream()
					.sorted((o1, o2) -> o2.getPhone().hashCode() - o1.getPhone().hashCode())
					.forEach(s->System.out.println(s));
		
		//Student2 클래스 이름 오름차순 정렬
		student2List.stream()
					.sorted((o1, o2) -> o2.getName().hashCode() - o1.getName().hashCode())
					.forEach(s->System.out.println(s));
		

	}
}
