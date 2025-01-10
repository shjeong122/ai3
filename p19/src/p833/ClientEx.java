package p833;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("127.0.0.1", 50001) ;
			System.out.println("[클라이언트] : 연결 성공");
			
			socket.close();
			System.out.println("연결 끊어짐");
		} catch (UnknownHostException e) {
			//IP 표기 방법이 잘못되었을 경우
			System.out.println("IP 표기 오류");
		} catch (IOException e) {
			// 해당 포트의 서버에 연결할 수 없는 경우
			System.out.println("해당 포트의 서버에 연결할 수 없습니다.");
		}
		
	}

}
