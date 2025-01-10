package p719_1;

public class Example {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.apply(result, score);
			}
		return result;			
	}
	public static void main(String[] args) {
	/*public static void main(String[] args) {
		int max = maxOrMin(new Operator() {
			
			@Override
			public int apply(int x, int y) {
				//사망연산자 ? 사용
				return (x>y) ? x:y;
			}
		});
		System.out.println("최대값 : " + max);
		//최소값 얻기
		int min = maxOrMin(new Operator() {
			
			@Override
			public int apply(int x, int y) {
				return (x<y) ? x:y;
			}
		});
		System.out.println("최소값 : " + min);
	}*/

		int max = maxOrMin(( x,  y) -> ( x > y) ? x : y);
			System.out.println("최대값 : " + max);
		//최소값 얻기
		int min = maxOrMin(( x,  y) ->  (x<y) ? x:y) ;
		System.out.println("최소값 : " + min);
	}
}