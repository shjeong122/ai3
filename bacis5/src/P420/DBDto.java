package P420;

public class DBDto {
//방법1 필드
	DB db = new DB() {
		@Override
		public void rundao() {
		System.out.println("오라클DB");
		}
	} ;
	void oraDB() {    // 선택
		db.rundao();  // or main에서 실행
	}
	
//방법2 로컬클래스 설계, new, 사용
	void mySql() {
		DB mysqlDB = new DB() {
			@Override
			public void rundao() {
			System.out.println("MySQL DB");
			}
		};
		mysqlDB.rundao();
	}
	
//방법3 매개변수, main에서 호출
	void nosql(DB d) {
		d.rundao();
	}
}