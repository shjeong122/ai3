package p563;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import javax.print.attribute.standard.Chromaticity;

public class TakeTime {

	public static void main(String[] args) throws UnsupportedEncodingException {
		long start = System.nanoTime();
		int[] scores = new int[1000];
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		int sum = 0;
		for(int score : scores) {
			sum += score;	
			
	} 	double avg = sum/scores.length;
	  	System.out.println(avg);

		long end = System.nanoTime();
		System.out.println(start);
	    System.out.println(end);
	    System.out.println( end - start + "nano second");
	    
	    //_8번문제
	    byte[] bytes = {-20, -107, -120, -21, -123, -107};
	    String str = new String(bytes,"UTF-8");
	    System.out.println("str : " + str);
	    
	    
	    //_10번 문제
	    //StringBuilder는 메모리를 효율적으로 사용한다.
	    //스마트폰 or IoT 등에 사용
	    String str10 = "";
	    for(int i=1; i<100; i++) {
	    	str10 += i;
	    }
	    System.out.println(str10);
	    StringBuilder sb = new StringBuilder();
	    for(int i=1; i<100; i++) {
	    	sb.append(i);
	    }
	    System.out.println(sb);
	
	//_11번
	    String data = "아이디, 이름, 패스워드";
	    StringTokenizer st =  new StringTokenizer(data, ",") ;
	    while( st.hasMoreTokens() ) {
		String token = st.nextToken();
		System.out.println(token);
	}
	
		//_12번
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 400;
		int i1 = 100;
		int i2 = 100;
		int i3 = 300;
		int i4 = 400;
		
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(obj1 == obj2); //true
		System.out.println(obj3 == obj4); //false
		
		//Intger 변수는 값의 범위가 -128~128사이이면 ==값으로 비교
		//위의 범위를 벗어난 수자는 주소로 비교
		System.out.println(obj3.equals(obj4));
		
		//_13번
		System.out.println(Math.ceil(5.3));
		System.out.println(Math.floor(5.3));
		System.out.println(Math.max(5.3, 2.5));
		System.out.println(Math.round(5.7)); //return type long 6
		
		//_15번
		// 올해 12월 31일 까지 남은 일수 출력
		// static : 클래스명.변수로 사용 가능
		LocalDateTime startDateTime = LocalDateTime.now();
		//System.out.println(startDateTime);
		
		LocalDateTime endDataTime = LocalDateTime.of(startDateTime.getYear(), 12, 31, 0, 0);
		//System.out.println(endDataTime);
		
		long remainDays = startDateTime.until(endDataTime, ChronoUnit.DAYS);
		System.out.println(remainDays);
		
		long remainMonths = startDateTime.until(endDataTime, ChronoUnit.MONTHS);
		System.out.println(remainMonths);
		
		long remainWeeks = startDateTime.until(endDataTime, ChronoUnit.WEEKS);
		System.out.println(remainWeeks);
		
		//_16번
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
		
		//_17번
		
		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{8,12}" ;
		boolean isMatch = Pattern.matches(regExp, id) ;
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("ID로 사용할 수 없습니다.");
		}

		//_19번
		
	
	}
	
}

