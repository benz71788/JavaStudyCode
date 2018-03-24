package ex20_2.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//���� ���α׷��� ���� �����ϰ� Ŭ���̾�Ʈ ���α׷��� �����Ѵ�.
public class ServerExample2 {
	
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
			

			/*
			 * InputStreamReader Ŭ����:
			 * ����Ʈ ��Ʈ���� ���� ��Ʈ������ �ٲپ��ִ� Ŭ����
			 * �� Ŭ������ �����ڿ� �������κ��� ���� InputStream��ü�� �Ѱ��ָ�
			 * ��Ʈ��ũ�� ���ŵ� �����͸� ���� ��Ʈ�� ���·� ���� �� �ִ�
			 * InputStreamReader��ü�� �����ȴ�.
			 */
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			/*
			 * PrintWriter Ŭ������ �̿��Ͽ� ���� ��Ʈ���� ����Ʈ ��Ʈ������ �ٲپ
			 * ����ϱ� ���ؼ��� �� Ŭ������ �����ڿ� OutputStream Ÿ���� ��ü�� �Ķ���ͷ�
			 * �Ѱ��־�� �Ѵ�.
			 */
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//�����͸� �����Ѵ�.
			String str = reader.readLine();
			
			//�����͸� ����Ѵ�.
			System.out.println(str);
			
			//�����͸� �۽��Ѵ�.
			writer.println("Hello, Client");
			
			/*
			 * PrintWriter Ŭ������ println�޼ҵ�� ���ڿ��� ����ϸ� �� ���ڿ���
			 * �޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �� ������ ������ٰ�
			 * �Ѳ����� �۽ŵȴ�.
			 * �׷��� println�޼ҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ���
			 * flush�޼ҵ带 ȣ���ؾ� �Ѵ�.
			 */
			
			writer.flush();
			
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
