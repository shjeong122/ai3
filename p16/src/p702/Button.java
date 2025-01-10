package p702;

public class Button {
	
	@FunctionalInterface  //인터페이스 독점하기위해 안에 만든다
	public static interface ClickListener {
		void onClick();

	}
	private ClickListener clickListener; //ClickListener 주소를 가진 필드
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
}
