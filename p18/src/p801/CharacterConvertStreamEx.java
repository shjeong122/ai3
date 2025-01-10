package p801;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {

	public static void main(String[] args) throws IOException {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println("data!! " + data);
	}

	private static String read() throws IOException {
		Reader reader = new InputStreamReader(new FileInputStream("d:/temp/cTest.txt"), "UTF-8");
		BufferedReader br= new BufferedReader(reader); //=> 속도 향상
		
		char[] data = new char[100];
		int num = br.read(data); // => 속도 향상
		System.out.println("num!! " + num );
		br.close(); // => 속도 향상
		String str = new String(data, 0, num);
		return str;
	}

	private static void write(String str) throws IOException {
		OutputStream os = new FileOutputStream("d:/temp/cTest.txt"); //기반스트림
		Writer writer = new OutputStreamWriter(os, "UTF-8");  //보조스트림
		
		writer = new OutputStreamWriter(new FileOutputStream("d:/temp/cTest.txt") , "UTF-8");
		BufferedWriter bw = new BufferedWriter(writer);//=> 속도 향상
		
		bw.write(str);//=> 속도 향상
		bw.flush();//=> 속도 향상
		bw.close();//=> 속도 향상
	}
}
