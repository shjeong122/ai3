package p718_1;

public class Example {

	public static void main(String[] args) {
		//5
		Button btnOk = new Button();
		btnOk.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(() ->System.out.println("Cancel 버튼을 클릭했습니다."));
	}
}
