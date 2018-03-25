package org.shane.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMultiChatting {
	
	public static void main(String[] args) {
		System.out.println("This is a Server!!!");
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002); 
			while(true) {
				Socket socket = serverSocket.accept();
				
				Thread thread = new PerClientThread(socket);
				Thread senderThread = new SenderThread(socket);
				
				thread.start();
				senderThread.start();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();
			} catch(Exception ignored) {
				System.out.println("소켓 종료 중에 에러가 발생했습니다.");
			}
		}

	}
}
