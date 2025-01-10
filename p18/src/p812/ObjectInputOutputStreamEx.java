package p812;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		//객체 직렬화
		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("d:/temp/object.dat"));
					//변수				//보조					//기반				//파일
		Member m1 = new Member("fall", "단풍이"); //객체 생성
		Product p1 = new Product("노트북", 1500000, 10, 20); //객체
		int[] arr1 = {1,2,3}; //배열 객체
	
		oos.writeObject(m1); //모든 객체와 클래스의 부모는 object
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush();
		oos.close();
		
		//------- 직렬화한 자료를 객체로 만들기(역직렬화)
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream("d:/temp/object.dat"));
		Member m2 = (Member) ois.readObject();
		Product p2 =(Product) ois.readObject();
		int[] arr2 =(int[]) ois.readObject();
		
		ois.close();
		
		System.out.println(m2);
		System.out.println(p2);
		for(int i=0;i<arr2.length; i++) {
		System.out.println(arr2[i]);
		}
		
	}					
		
}
