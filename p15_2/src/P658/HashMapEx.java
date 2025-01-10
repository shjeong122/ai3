package P658;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>() ;
		Map<String, String> hm2 = new HashMap<String, String> () ;
		
		//데이터 삽입
		hm1.put( 1, "사과" ); //return String null
		hm1.put( 2, "딸기" );
		hm1.put( 3, "바나나" );
		
		hm2.put( "빨강", "나무" );
		hm2.put( "노랑", "꽃" );
		hm2.put( "파랑", "바다" );
		
		//"홍길동", 20 
		//"김유신", 30
		Map<String, Integer> hm3 = new HashMap<String, Integer> ();
		hm3.put( "홍길동", 20 );
		hm3.put( "김유신", 30 );
		
		//Scores
		Map<String, Scores> hm4 = new HashMap<String, Scores> ();
		Scores s1 = new Scores(100,90);
		Scores s2 = new Scores(80, 100);
		
		hm4.put("홍길동", s1);
		hm4.put("김유신", s2);
		
		//사용하기
		//1. 검색하기 _키인 1을 넣으면 값 "사과"출력
		System.out.println(hm1.get(1)); 
		//"핸드폰"키를 넣으면 값이 나오게
		System.out.println(hm2.get("파랑"));
		//"홍길동" 키를 넣으면 국어점수 100점 나오게
		System.out.println(hm4.get("홍길동").getKor());
		//키가 아닌것을 넣으면 
		System.out.println(hm2.get("홍길동"));
		
		//삭제_hm4 객체 중 김유신 자료 삭제
		System.out.println(hm4.get("김유신")+" 삭제 전");
		//방법1
		hm4.remove("김유신");
		//방법2
		hm4.remove("김유신", s2);
		System.out.println(hm4.get("김유신"));
		
		//공란 확인
		System.out.println("hm4.isEmpty() : " + hm4.isEmpty());
	
		// key 동일한 것을 2개 넣어보기
		Map<Integer, Double> hm5 = new HashMap<Integer, Double> ();
		hm5.put(1, 1.1);
		hm5.put(3, 2.1);
		hm5.put(1, 3.1);
		
		//사이즈 확인
		System.out.println("hm5.size : " + hm5.size()); //2
		
		//1키를 넣어서 갑 출력
		System.out.println("hm5.get(1) : " + hm5.get(1)); //3.1
	
		
		//24(홍길동 100 60) 23(최수진 85, 90) 22(이경수 75 70)
		//(홍길동 100 90) 클래스명 Student
		Map<Integer, Student> hm6 = new HashMap<Integer, Student>();
		Student st1 = new Student("홍길동", 100, 60);
		Student st2 = new Student("최수진", 85, 90);
		Student st3 = new Student("이경수", 75, 70);
		Student st4 = new Student("이경수", 75, 100);
								
		hm6.put(24, new Student("홍길동", 100, 60) );
		hm6.put(23, new Student("최수진", 85, 90) );
		hm6.put(22, new Student("이경수", 75, 70) );
		hm6.put(21, new Student("이경수", 75, 100) );
		
		System.out.println("hm6.get(22) : " + hm6.get(22));
		System.out.println("hm6.get(22).getName() : " + hm6.get(22).getName());
		
		//key이름으로 해서 hm7 만들기
		Map<String,Student> hm7 = new HashMap<String, Student>();
		hm7.put(st1.getName(), st1);
		hm7.put(st2.getName(), st2);
		hm7.put(st3.getName(), st3);
		hm7.put(st4.getName(), st4);
		
		//"이경수" 점수 출력
		System.out.println( hm7.get("이경수").getKor() );
		System.out.println( hm7.get("이경수").getEng() );

	}
}
