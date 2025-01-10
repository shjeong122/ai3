package p862;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {

	public static void main(String[] args) throws IOException {
		//p862 자바 명령어로 JSON파일 만들기
		//JSON 객체 생성
		JSONObject root = new JSONObject();
		
		//속성 추가 = 데이터베이스에서 테이블 구조 만들기 = 속성 = 열이름 = 필드 = 변수
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		//객체 속성 추가
		JSONObject tel = new JSONObject();  //map방식, key는 set
		tel.put("home", "02-123-1234");
		tel.put("home", "02-123-5678");
		tel.put("mobile	", "010-123-1234");
		root.put("tel", tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill", skill);
		
		//JSON 얻기
		String json = root.toString();
		
		//콘솔에 출력
		System.out.println(json);
		
		//파일로 출력
		FileWriter fw= new FileWriter("d:/temp/member.json", Charset.forName("UTF-8"));	
		fw.write(json);
		fw.flush();
		fw.close();
	}

}
//JSONObject는 순서 상관없이 할당된 메모리에 Data를 넣는다.=>순서가 없다
//gson을 이용한다.
//Android20 부터 JSONObject는 LinkedHashMap을 사용하여 이름 값 쌍을 저장하므로 순서를 유지,
//19이하는 HashMap을 사용하여 순서가 유지되지 않는다. =>JSONArray 사용할 것


