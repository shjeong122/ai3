package P489;

import java.io.IOException;

public class FireWriter implements AutoCloseable{ //자동close 방법 1. implements

	@Override                                      //2. Override , 3. try(new 클래스()){}-catch(){}
	public void close() throws IOException{
		System.out.println("파일을 닫습니다.");
	}
	public FireWriter(String filePath) throws IOException {
		System.out.println(filePath + "파일을 엽니다.");
	}
	
	public void write(String data) throws IOException {
		System.out.println(data + "파일을 저장합니다.");
	}
	
	}
