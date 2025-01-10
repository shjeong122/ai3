package p518;

public class ExitEx {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("프로세스 강제 종료");
				System.out.println(0); //0강제종료, 1 또는 -1 비정상종료
			}
			System.out.println("if 아래");
		}
		System.out.println("if 위");
	
	
	}
	

}
