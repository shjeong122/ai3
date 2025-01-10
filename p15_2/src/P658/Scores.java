package P658;

public class Scores {
	//	국어, 영어 정수	
	private int kor;
	private int eng;
	public Scores(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
}
