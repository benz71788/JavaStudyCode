package ex20_2.client;

import java.io.*;
import java.net.Socket;

public class ClientExample2 {
	
	public static void main(String[] args) {
		System.out.println("This is Client!!");
		Socket socket = null;
		try {
			//�����ڸ� ȣ���ϸ� �� ������ �ȿ��� ���� ���α׷����� ���� ��û�� ���۵ǰ�
			//�� ��� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷��� ������ �ξ����� �ȴ�.
			socket = new Socket("127.0.0.1", 9000);
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//�����͸� �۽��Ѵ�.
			//println�޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� ��������
			//������ٰ� �Ѳ����� �۽ŵȴ�.
			//�׷��� ������ println�޼ҵ带 ȣ���� ���� �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ���
			//flush�޼ҵ带 ȣ���ؾ� �Ѵ�.
			writer.println("Hello, Server");
			
			writer.flush();
			
			//�����͸� �����Ѵ�.
			String str = reader.readLine();
			
			System.out.println(str);
			
			
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
