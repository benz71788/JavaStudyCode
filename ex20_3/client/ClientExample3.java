package ex20_3.client;

import java.io.*;
import java.net.Socket;

public class ClientExample3 {
	
	public static void main(String[] args) {
		System.out.println("This is Client!!");
		Socket socket = null;
		try {

			socket = new Socket("192.168.60.15", 9001);
			
			//두 스레드를 생성한다.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작한다.
			thread1.start();
			thread2.start();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
