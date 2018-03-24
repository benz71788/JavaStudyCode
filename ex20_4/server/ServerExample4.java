package ex20_4.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//서버 프로그램을 먼저 실행하고 클라이언트 프로그램을 실행한다.
public class ServerExample4 {
	
	public static void main(String[] args) {
		System.out.println("This is a Server!!");
		ServerSocket serverSocket = null;
		try {
			//연결 요청이 오면 소켓을 생성한다.
			//accept 메소드: 서버 소켓으로 연결 요청이 들어오면 연결을 맺고
			//클라이언트 소켓을 생성해서 리턴하는 메소드
			serverSocket = new ServerSocket(9002);	
			while(true) {
				Socket socket = serverSocket.accept();
				
				//요청이 올 때마다 스레드 생성
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
