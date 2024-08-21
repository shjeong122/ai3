package P411;

public class Button {
	String name;
	int a() {return 0;};
	static String sname;
	static double sa() {return 0.0;};
	
	public static interface ClickListener {
		
		void onClick();
	}
	private ClickListener clickListener;  //button 클래스의 필드=변수
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
}
