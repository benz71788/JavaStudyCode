package test.chatting.client;

import java.net.Socket;

public class ClientChatting {
	
	public static void main(String[] args) {
		System.out.println("This is a Client");
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1", 9000);
			
			Thread senderThread = new SenderThread(socket);
			Thread receiverThread = new ReceiverThread(socket);
			
			senderThread.start();
			receiverThread.start();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
