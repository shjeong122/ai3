package p720;

public class Example {
	private static Student[] students = {
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)	
	};
	//avg()메소드 작성
	//Function<Student> f = s -> s.getEnglishScore() ;
	private static double avg(Function<Student> f) { //f : 람다를 받은 변수 =>인터페이스 => 1개의 추상메소드
		//영어점수 모두 더하기
		//나누기 개수 = 평균
		int sum = 0;
		for(Student s:students) {
			sum += f.apply(s);
		}
		System.out.println("점수 합계 : " + sum);
		return sum/students.length ; //평균 리턴
	}

	public static void main(String[] args) {
		//8
		double englishAvg = avg(s -> s.getEnglishScore() );		
			System.out.println("영어 평균 점수 : " + englishAvg);
			
		/*double englishAvg = avg(new Function<Student>() {
			
			@Override
			public double apply(Student s) {
				// TODO Auto-generated method stub
				return  s.getEnglishScore();
			}
		});	*/
	
		double englishAvg1 = avg(s -> s.getEnglishScore());
		double englishAvg2 = avg(Student::getEnglishScore);
		System.out.println("연습8_ 영어 평균 점수 : " + englishAvg1);
		System.out.println("연습9_영어 평균 점수2 : " + englishAvg2);
		
		double mathAvg = avg(s -> s.getMathScore());
		double mathAvg2 = avg(Student::getMathScore);
		System.out.println("연습8_수학 평균 점수 : " + mathAvg);
		System.out.println("연습9_수학 평균 점수 : " + mathAvg2);
		
	}
}
