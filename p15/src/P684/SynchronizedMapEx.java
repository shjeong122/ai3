package P684;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {
	
	public static void main(String[] args) {
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		//Map<Integer, String> map = new HashMap<>();
		
		Thread threadA = new Thread() {
			public void run( ) {
				for(int i=0; i<=1000; i++) {
					map.put(i, "내용"+i);
				}
			}
		};
		Thread threadB = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(i, "내용"+i);
				}
			}
		};
		Thread threadC = new Thread() {
			public void run( ) {
				for(int i=0; i<=1000; i++) {
					System.out.println(map.get(i));
				}
			}
		};
		Thread threadD = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					System.out.println(map.get(i));
				}
			}
		};	
		threadA.start();
		threadB.start();
		threadC.start();  
		threadD.start();
		
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {
		}
		
		int size = map.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		}
}
