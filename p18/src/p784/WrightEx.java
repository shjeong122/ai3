package p784;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WrightEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:/temp/test1.db");
			
			//byte = 1byte 출력
			byte a=10; 
			byte b=10;
			byte c=10;
			
			fos.write(a); //surrounding -IOException
			fos.write(b); //1바이트 출력
			fos.write(c);
			
			//바이트 배열
			byte[] bArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			fos.write(bArr); //배열의 전체 출력
			
			//fos.write(bArr, 1, 6); //배열의 1번 인덱스에서 6번인덱스까지 출력
			
			fos.flush(); //쏟아내라
			fos.close(); //객체생성한것 stack에서 내려라, 더 이상 그 자료 사용x => 메모리 절약
			
		} catch (FileNotFoundException e) {
			//파일이 없을 수도 있으니까 예외처리 필요
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
