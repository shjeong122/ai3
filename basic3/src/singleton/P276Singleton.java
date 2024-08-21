package singleton;

public class P276Singleton {
	private static P276Singleton singleton = new P276Singleton();
	private P276Singleton() {}
	public static P276Singleton getInstance() {
		return singleton;
		
		
	}
}
