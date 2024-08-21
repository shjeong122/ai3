package ch07_07;

public class C extends A{

	@Override
	int sub(int n) {
		int result = hap(n);
		return result - 200;
	}
	
	long mul(int n) {
		long m = 1;
		for(int i=1; i<=n; i++) {
			m = m * i;
		}
		return m;
	}
}
