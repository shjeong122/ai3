package p817;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("d:/temp/images");
		File file1 = new File("d:/temp/file1.txt");
		File file2 = new File("d:/temp/file2.txt");
		File file3 = new File("d:/temp/file3.txt");
		
		if(dir.exists()==false) {dir.mkdirs();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}
		
		File temp = new File("d:/temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified()))); //%칸지정 : (-)왼쪽에서 오른쪽으로/문자 앞에서 뒤로, 숫자는 뒤에서 앞으로
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName()); //s : 칸 나눔
		}else {
			System.out.printf("%-10s%-20s", file.length(), file.getName());
		}
		System.out.println();
		}
	}

}
