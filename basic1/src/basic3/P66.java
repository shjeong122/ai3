package basic3;

public class P66 {
	
	static int a=8;
	static int i=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i++ i=i+1 i+=1
		
		for(; i<=10; i+=1) {
		
			System.out.println( i + " " + a + " " );
		}
		System.out.println();
	System.out.println( i + " " + a + " " );
	kk(i,a);
	kkk();
	}//end main()
	
	public static void kk(int i1, int a1) {
		System.out.println("나는 kk함수다"+i1+" "+a1);
	}
	public static void kkk() {
		System.out.println("나는 kk함수다"+i+" "+a);
		
		
		
		

	}
}//end class
