package p862;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonEx {

	public static void main(String[] args) {
		// JSON 파일을 java로 가져오기
		try {
			BufferedReader br = new BufferedReader(new FileReader("d:/temp/member.json",Charset.forName("UTF-8")) ); // 기반스트림(파일) + 속도향상
			String json = br.readLine();
			br.close();
			
			//JSON 파싱
			JSONObject root = new JSONObject(json);
			
			System.out.println("id: " + root.getString("id")); //id: winter
			System.out.println("name: "+ root.getString("name")); //name: 한겨울
			System.out.println("age: "+ root.getInt("age")); //age: 25
			System.out.println("student: "+root.getBoolean("student")); //student: true
			//결과가 object (=JSONArray)로 나옴
			System.out.println("skill: "+root.get("skill")); //skill: ["java","c","c++"]
			
			//skill 키안에 'java'를 출력
			JSONArray a = (JSONArray) root.get("skill"); //JSONArray는 put으로 넣고 get으로 꺼낸다.
			System.out.println(a); //["java","c","c++"]
			System.out.println(a.get(0)); //java
			System.out.println(a.get(2));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

}
