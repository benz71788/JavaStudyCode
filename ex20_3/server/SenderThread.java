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
				//키보드로부터 문자열을 입력받는다.
				String str = reader.readLine();
				
				//사용자가 "bye"라고 입력하면 반복문을 빠져나간다.
				if(str.equals("bye")) {
					break;
				}
				
				//입력된 문자열을 클라이언트로 송신한다.
				writer.println(str);
				writer.flush();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch(Exception ignored) {
				System.out.println("소켓 닫는 중 에러 발생했습니다.");
			}
		}
	}
}
