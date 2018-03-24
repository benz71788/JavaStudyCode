package ex20_4.client;

import java.io.*;
import java.net.Socket;

public class ClientExample4 {
	
	public static void main(String[] args) {
		//args �Ķ���ͷ� ��ȭ���� �Է� �޽��ϴ�.
		if(args.length != 1) {
			System.out.println("��ȭ���� �Է��ϼ���");
			return;
		}
		try {
			//������ ������ �ν��ϴ�.
			Socket socket = new Socket("192.168.60.6", 9002);
			
			//�޽��� �۽� ������ ����
			Thread thread1 = new SenderThread(socket, args[0]);
			
			//�޽��� ���� ������ ����
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 �����Ѵ�.
			thread1.start();
			thread2.start();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
