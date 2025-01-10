package P662;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		//스레드를 부모로 하는 익명형 자식 클래스 생성
		Thread threadA = new Thread() {  //익명형 자식 클래스
			public void run() {
				//멀티처리할 코드 입력
				for(int i=1; i<=1000; i++) {
					map.put(String.valueOf(i), i);
				}
			};
		}; 
		
		Thread threadB = new Thread() {  //익명형 자식 클래스
			public void run() {
				//멀티처리할 코드 입력
				for(int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			};
		}; 
		
		Thread threadC = new Thread() {  //익명형 자식 클래스
			public void run() {
				//멀티처리할 코드 입력
				for(int i=1; i<=1000; i++) {
					System.out.println(map.get(String.valueOf(i)));
				}
			};
		}; 
		
		Thread threadD = new Thread() {  //익명형 자식 클래스
			public void run() {
				//멀티처리할 코드 입력
				for(int i=1001; i<=2000; i++) {
					System.out.println(map.get(String.valueOf(i)));
				}
			};
		}; 
		
		//작업스레드 실행
		threadA.start();  //1~1000
		threadB.start();  //1001~2000
		threadC.start();  //1~1000
		threadD.start();  //1001~2000
		
		try {
			threadA.join();  //main과 join, 모든 작업이 실행된 후 main이 실행되도록 한다. 
			threadB.join();
			threadC.join();
			threadD.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		int size = map.size();
		System.out.println("총 엔드리 수 : " + size);	
	}
}
