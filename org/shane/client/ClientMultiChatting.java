package org.shane.client;

import java.net.Socket;

public class ClientMultiChatting {
	
	public static void main(String[] args) {
		if(args.length != 1) {
			return;
		}
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 9002);
			
			Thread senderThread = new SenderThread(socket, args[0]);
			Thread receiverThread = new ReceiverThread(socket);
			
			senderThread.start();
			receiverThread.start();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
