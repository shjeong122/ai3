package p820;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesEx {

	public static void main(String[] args) {
		
		try {
			String data = "" + 
					"id: winter\n" +
					"email: winter@mycompany.com\n" +
					"tel: 010-123-1234";
			
			//path 객체 생성 : 경로지정
			Path path = Paths.get("d:/temp/user.txt");
			
			//파일 생성 및 데이터 저장 : 해당 경로의, 해당 파일 사용, 자료포맷
			Files.writeString(Paths.get("d:/temp/user.txt"), data, Charset.forName("UTF-8"));
			
			//파일 정보 얻기
			System.out.println("파일 유형: " + Files.probeContentType(path));
			System.out.println("파일 크기: " + Files.size(path) + " bytes");
			
			//파일 읽기
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
			
			OutputStream os = new FileOutputStream("d:/temp/copy_user.txt");
			long result = Files.copy(path, os); //result안에는 파일의 크기가 들어 간다.
			System.out.println(result);
			
			os.close();
	
			//delete _ 상위에 close 해야 작동
			Path path1 = Paths.get("d:/temp/copy_user.txt");
			Files.delete(path1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
