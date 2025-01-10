package p759;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Reduce {

	public static void main(String[] args) {
		
		//컬렉션리스트 생성
		List<Student> sList =
				Arrays.asList(new Student(92, 1.0), new Student(82, 1.5), new Student(95, 1.2));
		
		int sum1 = sList.stream().mapToInt(s->s.getScore()).sum();
		System.out.println("sum 점수 합계 : " + sum1);

		//reduce사용
		long sum2 = sList.stream().mapToInt(s->s.getScore()).reduce(0, (a,b)->a+b); //reduce : applyAsInt 오버라이드한 것
		System.out.println("reduce 점수 합계 : " + sum2);
		
		IntBinaryOperator i;
		/* : 함수적 인터페이스
		int applyAsInt(int left, int right) : 추상 메소드 구조
		right null은 익명현 구현 클래스로 만든것을 람다로 축약한 것. */

		long max = sList.stream().mapToInt(s->s.getScore()).reduce(0, (a,b)->(a>b) ? a:b); //reduce : applyAsInt 오버라이드한 것
		System.out.println("reduce 가장 큰 수  : " + max);
	}

}
class Student{
	private int score;
	private double eye;
	
	public Student(int score, double eye) {
		super();
		this.score = score;
		this.eye = eye;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getEye() {
		return eye;
	}
	public void setEye(double eye) {
		this.eye = eye;
	}
}