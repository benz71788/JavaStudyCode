package ex20_3.client;

import java.io.*;
import java.net.Socket;

public class ClientExample3 {
	
	public static void main(String[] args) {
		System.out.println("This is Client!!");
		Socket socket = null;
		try {

			socket = new Socket("192.168.60.15", 9001);
			
			//�� �����带 �����Ѵ�.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 �����Ѵ�.
			thread1.start();
			thread2.start();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
