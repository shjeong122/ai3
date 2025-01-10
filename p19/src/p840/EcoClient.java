package p840;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EcoClient {

	public static void main(String[] args) {
		Socket socket ;
		try {
			socket = new Socket("127.0.0.1", 50001) ;
			System.out.println("[클라이언트] : 연결 성공\n");
			
			//데이터 보내기
			String sendMessage = "나는 자바가 좋아!";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("클라이언트에서 자료 발송.\n");
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("서버로부터 데이터 수신. \n > " + receiveMessage);
					
			socket.close();
			System.out.println("\n[클라이언트] : 연결 끊어짐");
			
		} catch (UnknownHostException e) {
			//IP 표기 방법이 잘못되었을 경우
			System.out.println("IP 표기 오류");
		} catch (IOException e) {
			// 해당 포트의 서버에 연결할 수 없는 경우
			System.out.println("해당 포트의 서버에 연결할 수 없습니다.");
		}
	}

}
