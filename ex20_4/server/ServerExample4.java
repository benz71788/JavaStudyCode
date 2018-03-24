package ex20_4.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//���� ���α׷��� ���� �����ϰ� Ŭ���̾�Ʈ ���α׷��� �����Ѵ�.
public class ServerExample4 {
	
	public static void main(String[] args) {
		System.out.println("This is a Server!!");
		ServerSocket serverSocket = null;
		try {
			//���� ��û�� ���� ������ �����Ѵ�.
			//accept �޼ҵ�: ���� �������� ���� ��û�� ������ ������ �ΰ�
			//Ŭ���̾�Ʈ ������ �����ؼ� �����ϴ� �޼ҵ�
			serverSocket = new ServerSocket(9002);	
			while(true) {
				Socket socket = serverSocket.accept();
				
				//��û�� �� ������ ������ ����
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
