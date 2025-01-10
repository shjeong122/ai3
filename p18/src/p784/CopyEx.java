package p784;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;

public class CopyEx {

	public static void main(String[] args) {
		//copy = input -> output
		try {
			FileInputStream fis = new FileInputStream("d:/temp/program.txt");
			FileOutputStream fos = new FileOutputStream("d:/temp/copy_program.txt");
			
			byte[] data = new byte[1024]; //1kb = 1024byte
			while(true) {
				int num = fis.read(data);
				if (num ==-1) break;
				fos.write(data,0,num);
			}
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
