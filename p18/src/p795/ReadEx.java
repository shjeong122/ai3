package p795;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadEx {

	public static void main(String[] args) {
		//797
		
		try {
			FileReader fr = null;
			fr = new FileReader("d:/temp/writeData.txt");
			while(true) {
				int data = fr.read();
				if(data == -1) break;
				System.out.print(data + " " ); //문자가 유니코드로 출력
			}
			System.out.println();
			
			FileReader fr1 = new FileReader("d:/temp/writeData.txt");
			while(true) {
				int data = fr1.read();
				if(data == -1) break; 
				System.out.print((char)data + " ");
			}
			fr.close(); //stack과 heap의 연결을 끊는다.
			System.out.println();
			
			//배열 담아서 한꺼번 가져오기 빠르다
			fr = new FileReader("d:/temp/writeData.txt");
			char[] data = new char[10];
			while(true) {
				int num = fr.read(data,0,10);
				System.out.println(num);
				if(num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i] +" ");	
				}
				/*for(char d: data) {
					System.out.println(d);
				}*/
			}
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
