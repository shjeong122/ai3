package interfacestudy;

public class UseLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunInterface result = new FunInterface() {
			
			@Override
			public int calcu(int data1, int data2) {
				// TODO Auto-generated method stub
				return data1 + data2;
			}
		};
		System.out.println(result.calcu(200, 500));
	
		//람다식
		FunInterface resultLam = (int data1, int data2) ->{
		return data1 - data2;
		};
	System.out.println(resultLam.calcu(500, 200));
	System.out.println("=======권장안하는 람다식========");
	/*문장이 하나의 문장이고, 리턴문이라면 집합기호와 리턴기호 뺄 수 있다.
	 * 이렇게 권장하지 않는다. 줄이고 싶다면 타입기호만 빼자.
	FunInterface resultLamNon = (data1, data2) ->{
		return data1 - data2;
	};
	*/
	FunInterface resultLamNon = (data1, data2) -> data1 * data2;
	System.out.println(resultLamNon.calcu(22, 19));
	
	//클라이언트 메소드, 콜러 메소드
	aaa(50,10, (data111, data222)-> data111 / data222);
	//aaa((data111, data222)-> {return data111 / data222};
	aaa(800,500,new FunInterface() {
		
		@Override
		public int calcu(int data1, int data2) {
			// TODO Auto-generated method stub
			return 0;
		}
	});
	/*
	 * String aaas = new String ("you!")
	 * bbb(1,3, aaas);
	 */
	bbb(1,3, new String());
}
	//서버메소드, 워커 메소드
	static void aaa(int data1, int data2, FunInterface i) {
		System.out.println(i);
		System.out.println(i.calcu(data1, data2));
	}
	static void bbb(int data1, int data2, String i) {
		System.out.println(i);
		System.out.println(i.substring(data1, data2) );
	}
}