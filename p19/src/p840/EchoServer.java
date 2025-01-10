package p840;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	private static ServerSocket serverSocket = null;
	public static void main(String[] args) {
		System.out.println("----------------------------------------------");
	    System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter키를 입력하세요");
	    System.out.println("----------------------------------------------");

	    //TCP서버 시작
	    startServer();
	    Scanner sc = new Scanner(System.in);
	    while(true) {
	       String key = sc.nextLine();
	       if(key.equalsIgnoreCase("q") ) break;
	    }
	    sc.close();
	    stopServer();	      
	}
	private static void stopServer() {
      try {
          serverSocket.close();
          System.out.println( "[서버] : 종료 ");
       } catch (IOException e) {
          
          e.printStackTrace();
       }	
	}
	private static void startServer() {
		//스레드 멀티처리 
	      Thread thread = new Thread() {
	         @Override
	         public void run() {
	            try {
	               serverSocket = new ServerSocket(50001); // 1단계 객채화(포트지정) 
	               System.out.println("서버 시작됨");
	               
	               while(true) {
	                  System.out.println(" \n[ 서버 ] : 연결 요청 기다림 \n ");
	                  
	                  //연결수락 837page 11줄 명령이 실행되면 여기 수행 됨 클라이어트 프로그램 소켓 연결 요청 들어오면 
	                  Socket socket = serverSocket.accept();
	                  
	                  //연결하기
	                  InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
	                  System.out.println( "[ 서버 ] : " + isa.getHostString() + "의 연결 요청을 수락함 \n" );
	                  
	                  //메세지 받기
	                  DataInputStream dis = new DataInputStream(socket.getInputStream());
	                  String message = dis.readUTF();
	                  System.out.println("클라이언트에서 받은 메세지 \n > " + message);
	                  
	                  //데이터 전송
	                  String message2 = "나는 서버야, 클라이언트 안녕!";
	                  DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
	                  dos.writeUTF(message2);
	                  dos.flush(); //write는 항상 flush 해줄 것
	                  System.out.println("\n서버에서 메세지를 보냈습니다. 확인 바랍니다.");
	                  
	                  socket.close();
	                  System.out.println( "\n[ 서버 ] : " + isa.getHostString() + "의 연결 끊음 " );
	                  
	               }
	               
	            } catch (IOException e) {
	            	System.out.println("==강제 종료==");
	            }
	         }
	      }; //익명형 자식객체 	
	      thread.start();
	}

}
