package P664;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		//클래스로 파일 불러오기(로드)
		p.load(PropertiesEx.class.getResourceAsStream("database.properties"));
		
		System.out.println(p.getProperty("driver"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("password"));
		
		p.setProperty("icon", "star");
		System.out.println(p.getProperty("icon"));

	}

}
