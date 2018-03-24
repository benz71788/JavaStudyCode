package ex20_3.server;

import java.net.Socket;
import java.io.*;

public class SenderThread extends Thread{
	Socket socket;
	SenderThread(Socket socket){
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				//Ű����κ��� ���ڿ��� �Է¹޴´�.
				String str = reader.readLine();
				
				//����ڰ� "bye"��� �Է��ϸ� �ݺ����� ����������.
				if(str.equals("bye")) {
					break;
				}
				
				//�Էµ� ���ڿ��� Ŭ���̾�Ʈ�� �۽��Ѵ�.
				writer.println(str);
				writer.flush();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch(Exception ignored) {
				System.out.println("���� �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}
}
