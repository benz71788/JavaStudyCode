package ex20_4.server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	//ArrayList��ü�� ���� �����尡 ���ÿ� ����ϰ� �Ǹ� ������ �߻��� �� �־�
	//�����ϰ� ������ �� �ִ� ����ȭ�� ����Ʈ�� �����.
	//����ȭ�� ����Ʈ�� ����� ���� java.util.Collections Ŭ������ 
	//synchronizedList�޼��带 �̿��Ѵ�.
	static List<PrintWriter> list
		= Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket;
	PrintWriter writer;
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer); //����Ʈ�� ������ ��� ��Ʈ���� ����Ѵ�.
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			/*
			 * SenderThread.java����
			 * writer.println(name);
			 * writer.flush();
			 * 		�� ���� name�� �Ʒ��� ���忡�� �о�´�.
			 */
			//���ŵ� ù��° ���ڿ��� ��ȭ������ ����ϱ� ���� �����Ѵ�.
			name = reader.readLine();
			sendAll("#" + name + "���� �����̽��ϴ�.");
			System.out.println("#" + name + "���� �����̽��ϴ�.");
			
			while(true) {
				String str = reader.readLine();
				
				//������ ������ �������� null�� �����Ѵ�.
				if(str == null) {
					break;
				}
				//���ŵ� �޽��� �տ� ��ȭ���� �ٿ��� ��� Ŭ���̾�Ʈ�� �۽��Ѵ�.
				sendAll(name + "> " + str);
				System.out.println(name + "> " + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			list.remove(writer);
			//����ڰ� ä���� �����ߴٴ� �޽����� ��� Ŭ���̾�Ʈ�� ������.
			sendAll("#" + name + "���� �����̽��ϴ�.");
			System.out.println("#" + name + "���� �����̽��ϴ�.");
			
			try {
				socket.close();
			} catch(Exception ignored) {
				System.out.println("���� �ݴ� �߿� ������ �߻��Ͽ����ϴ�.");
			}
		}
	}
	
	//������ ����� ��� Ŭ���̾�Ʈ�� �Ȱ��� �޼����� ������.
	public void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}
	
	
}
