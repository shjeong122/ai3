package p702;

public class ButtonEx {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
		btnOk.click();
		
		btnOk.setClickListener(() -> System.out.println("취소 버튼을 눌렀습니다."));
		
		btnOk.click();
		
	}
}
