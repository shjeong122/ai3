package P411;

public class ButtonEx {
//다형성, 메인메소드-클래스 생성 및 삭제를 독점하여 사용한다.
	//버튼=이벤트, 사용자의 행동으로 선택
	//모든 버튼을 생성해야한다.
	//Listener = 감시자 : 이벤트를 감지하여(버튼이 눌리면) 행동 시작
	
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}	
		}
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("취소 버튼을 눌렀습니다.");
			}
		}
		btnOk.setClickListener(new CancelListener());
		btnOk.click();
	}
}
