package ex20_1.client;

import java.io.*;
import java.net.Socket;

public class ClientExample1 {
	
	public static void main(String[] args) {
		System.out.println("This is Client!!");
		Socket socket = null;
		try {
			//�����ڸ� ȣ���ϸ� �� ������ �ȿ��� ���� ���α׷����� ���� ��û�� ���۵ǰ�
			//�� ��� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷��� ������ �ξ����� �ȴ�.
			socket = new Socket("127.0.0.1", 9000);
			
			//������ ���ſ� ����� �Է� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			InputStream in = socket.getInputStream();
			
			//������ �۽ſ� ����� ��� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			OutputStream out = socket.getOutputStream();
			
			String str = "Hello, Server";
			
			//getBytes �޼ҵ�� ���ڿ��� ����Ʈ �迭�� ����� �޼ҵ��̴�.
			out.write(str.getBytes());
			
			//���ڷ� �Ѱ��� �����͸� �۽��Ѵ�.
			byte arr[] = new byte[128];
			in.read(arr);		//�����͸� �����Ѵ�.
			System.out.println(new String(arr));//���ŵ� �����͸�  ����Ѵ�.
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();			// ������ �ݴ´�.
			} catch(Exception ignored) {
				System.out.println("������ �ݴ� �� ������ �߻��߽��ϴ�.");
			}
		}
	}

}
