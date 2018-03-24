package ex20_1.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//���� ���α׷��� ���� �����ϰ� Ŭ���̾�Ʈ ���α׷��� �����Ѵ�.
public class ServerExample1 {
	
	public static void main(String[] args) {
		System.out.println("This is a Server!!");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			//���� ������ ���� ��û�� ��ٸ��ٰ�, 
			//���� ��û�� ���� ������ �ΰ� �� �ٸ� ������ �����Ѵ�.
			serverSocket = new ServerSocket(9000);	//���� ������ �����մϴ�.
			
			//���� ��û�� ���� ������ �����Ѵ�.
			//accept �޼ҵ�: ���� �������� ���� ��û�� ������ ������ �ΰ�
			//Ŭ���̾�Ʈ ������ �����ؼ� �����ϴ� �޼ҵ�
			socket = serverSocket.accept();
			
			//������ ���ſ� ����� �Է� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			InputStream in = socket.getInputStream();
			
			//������ �۽ſ� ����� ��� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[128];
			in.read(arr); //�����͸� �����Ѵ�.
			//���ŵ� �����͸� ����Ѵ�.
			System.out.println(new String(arr));
			
			String str = "Hello, Client";
			//getBytes �޼ҵ�� ���ڿ��� ����Ʈ �迭�� ����� �޼ҵ��Դϴ�.
			out.write(str.getBytes());	//�����͸� �۽��Ѵ�.
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();		//������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
			
			try {
				serverSocket.close();	//���� ������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("���� ���� �ݴ� �� �����Դϴ�.");
			}
		}
	}

}
