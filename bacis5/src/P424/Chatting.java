package P424;

public class Chatting {
	class Chat {
		void start() {}
		void setMessage(String message) {}
	}
	void startChat(String chatId) {
		String nickName = chatId; //null -> chatId, 로컬메소드의 지역변수는 final특성이기 때문에 바뀌면 안된다.
		//nickName = chatId;		// => 바뀌었기 때문에 오류발생
		Chat chat = new Chat() {  //Chat클래스의 익명 자식 클래스
			public void start() { //@start 
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+ nickName + "]" + inputData;
					setMessage(message);
				}
			}
		};
		chat.start();
	}
}