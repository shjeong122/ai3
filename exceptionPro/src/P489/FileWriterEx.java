package P489;

import java.io.FileWriter;

public class FileWriterEx {
	FileWriter fw = null;
	public static void main(String[] args) {
		
		/* try {
			fw = new FileWriter("file.txt");
			fw.write("Java");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		} */
		try(FileWriter fw = new FileWriter("file.txt");) {
			fw.write("Java");
		}catch(Exception e) {
			e.printStackTrace();	
		}
	}

}
