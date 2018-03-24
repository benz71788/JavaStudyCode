package ex20_3.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//���� ���α׷��� ���� �����ϰ� Ŭ���̾�Ʈ ���α׷��� �����Ѵ�.
public class ServerExample3 {
	
	public static void main(String[] args) {
		System.out.println("This is a Server!!");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			
			System.out.println("=================���� ����====================");
			System.out.println(socket.getInetAddress().getHostAddress() + "���� �����ϼ̽��ϴ�.");
			System.out.println("===========================================");
			
			//�� �����带 �����Ѵ�.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 �����Ѵ�.
			thread1.start();
			thread2.start();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();	//���� ������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("���� ���� �ݴ� �� �����Դϴ�.");
			}
		}
	}

}
