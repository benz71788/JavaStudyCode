package ex20_3.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//서버 프로그램을 먼저 실행하고 클라이언트 프로그램을 실행한다.
public class ServerExample3 {
	
	public static void main(String[] args) {
		System.out.println("This is a Server!!");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			
			System.out.println("=================접속 정보====================");
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 접속하셨습니다.");
			System.out.println("===========================================");
			
			//두 스레드를 생성한다.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작한다.
			thread1.start();
			thread2.start();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();	//서버 소켓을 닫는다.
			} catch(Exception ignored) {
				System.out.println("서버 소켓 닫는 중 에러입니다.");
			}
		}
	}

}
