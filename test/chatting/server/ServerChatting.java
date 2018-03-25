package test.chatting.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatting {
	
	public static void main(String[] args) {
		System.out.println("This is a Server!!!");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			
			System.out.println("==============채팅 상대방 주소===============");
			System.out.println(socket.getInetAddress().getHostAddress());
			System.out.println("=========================================");
			
			Thread senderThread = new SenderThread(socket);
			Thread receiverThread = new ReceiverThread(socket);
			
			senderThread.start();
			receiverThread.start();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();
			} catch(Exception e) {
				System.out.println("서버소켓 종료 중 에러가 발생하였습니다.");
			}
			
		}
	}

}
