package p784;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:/temp/test1.db");
			/* while(true) { 
			int i = fis.read();
			if(i == -1) break; //끝까지 읽으면 -1
			System.out.print(i + " ");
			} */
			
			//미리 덩어리 만들어서 사용
			/*byte[] bArr = new byte[3];
			while(true) { 
				int i = fis.read(bArr);
				if(i == -1) break; //끝까지 읽으면 -1
				for(byte b : bArr) {
				System.out.print(b + " ");
				} 
			}			*/
			
			byte[] bArr1 = new byte[20];
			while(true) { 
				//int i = fis.read(bArr1);
				int i = fis.read(bArr1, 0 , 10);
				if(i == -1) break; //끝까지 읽으면 -1
				for(byte b : bArr1) {
				System.out.print(b + " ");
				} 
			}	
			
			fis.close(); //파일은 메모리에서 해제, 항상 적어서 메모리를 효율적으로 사용하자
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
