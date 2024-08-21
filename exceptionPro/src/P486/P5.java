package P486;

public class P5 {
	public static void main(String[] args) {
		//try method1(); 
		//} catch(Exception e) {           // =>틀림 : 작은것 -> 큰것으로 exception할 것.
		//} catch(ClassNotFoundException)	
	}
	public static void method2() throws Exception {
		method1();
		
	}
	
	public static void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
}
