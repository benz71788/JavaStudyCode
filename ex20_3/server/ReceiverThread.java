package ex20_3.server;

import java.io.*;
import java.net.Socket;

public class ReceiverThread extends Thread{
	
	Socket socket;
	ReceiverThread(Socket socket){
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			//Ŭ���̾�Ʈ�κ��� �޼����� �����ؼ� ����ͷ� ����ؾ� �Ѵ�.
			while(true) {
				String str = reader.readLine();
				//������ ������ �������� null�� �����Ѵ�.
				if(str == null) {
					break;
				}
				System.out.println("����> " + str);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

}
