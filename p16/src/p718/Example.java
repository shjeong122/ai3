package p718;

public class Example {

	public static void main(String[] args) {
		// 확인문제 4번
		/*Thread thread = new Thread(new Runnable() {
			//thread에 runnable을 오버라이드해서 반복
			@Override
			public void run() {
				for(int i=0; i<3; i++) {
					System.out.println("작업 스레드가 실행됩니다.");
				}
			};
		);*/
		
		Thread thread = new Thread(() -> {
				for(int i=0; i<3; i++) {
					System.out.println("작업 스레드가 실행됩니다.");
				}
			}
		);
		thread.start();
	}
}
