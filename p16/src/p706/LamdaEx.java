package p706;

public class LamdaEx {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				double result = x+y;
				return result;
			}
		});
		
		person.action(( x,  y) -> { double result = x+y;
									return result;	});	
		
		person.action(( x,  y) -> x+y ); //처리할 문장이 1개일 경우, return 생략 가능
		
		person.action(( x,  y) -> sum(x, y));
		
			}

	private static double sum(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	
		}
}
