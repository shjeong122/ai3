package P420;

public class DBEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBDto d1 = new DBDto() ;
		d1.oraDB();  //선택 설계에서 void x
		d1.db.rundao(); // 설계에서 void
		
		d1.mySql();
		
		d1.nosql(new DB() { //부모이름을 코드작성 ->익명자식
			@Override
			public void rundao() {
			System.out.println("NoSQL DB");
			}
		});
		
	}

}
