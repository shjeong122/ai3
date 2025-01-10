package p795;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEx {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("d:/temp/writeData.txt");
			
			char a='A'; //문자 한글자는 ' '
			fw.write(a);
			char b='b';
			fw.write(b);
			
			char[] arr = {'c','d','e'}; //배열
			fw.write(arr);
			
			String s = "한글"; //문자열 여러글자 " "
			fw.write(s);
			
			fw.write(100); //int => 유니코드 100 = d
			fw.write(arr, 0, 2); //배열, 인덱스(부터), len(몇개)
			fw.write(s, 1, 1); //String, 인덱스, len
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
