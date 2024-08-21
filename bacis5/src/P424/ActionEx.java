package P424;

public class ActionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사합니다.");	
			}
		};
		action.work();
	}
}
