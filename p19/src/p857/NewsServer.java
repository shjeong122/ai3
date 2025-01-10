package p857;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) {
		System.out.println("----------------------------------------------");
	    System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter키를 입력하세요");
	    System.out.println("----------------------------------------------");
	    
	    //UDP 서버 시작
	    startServer();
	    
	    //키보드 입력
	    Scanner sc = new Scanner(System.in);
	    while(true) {
	    	String key = sc.nextLine();
	    	if(key.toLowerCase().equals("q")) 
	    		break;
	    }
	    sc.close();
	    
	    //TCP 서버 종료
	    stopServer();
	}

	private static void stopServer() {
	      try {
	    	  datagramSocket.close();
	    	  executorService.shutdown();
	          System.out.println( "[서버] : 종료 ");
	       } catch (Exception e) {
	    	   System.out.println("서버 강제 종료");
	       }	
	}
		private static void startServer() {
			//스레드 멀티처리 
		      Thread thread = new Thread() {
		         @Override
		         public void run() {
		            try {
		            	datagramSocket  = new DatagramSocket(50002); // 1단계 객채화(포트지정) 
		               System.out.println("서버 시작됨");
		               
		               while(true) {
		            	   DatagramPacket receviePacket = new DatagramPacket(new byte[1024], 1024); //바이트기반 스트림 처리를 위해 바이트로 설정
		            	   executorService.execute(()->{ //람다식 -> Runnable을 재정의하는 코드 작성
		            		   try {
								String newsKind = new String(receviePacket.getData(), 0, receviePacket.getLength(),"UTF-8");
								
								SocketAddress socketAddress = receviePacket.getSocketAddress();
								
								for(int i=0; i<=10; i++) {
									String data = newsKind + "뉴스" + i;
									byte[] bytes = data.getBytes("UTF-8");
									DatagramPacket sendPack = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
									datagramSocket.send(sendPack);
								}
								
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		            		   
		       			});

						}

					} catch (IOException e) {
						System.out.println("강제로 서버 종료함 ");
					}
				}

				}; // 익명형 자식객체

				thread.start();
		}
	}
		
