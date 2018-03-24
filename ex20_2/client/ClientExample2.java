package ex20_2.client;

import java.io.*;
import java.net.Socket;

public class ClientExample2 {
	
	public static void main(String[] args) {
		System.out.println("This is Client!!");
		Socket socket = null;
		try {
			//생성자를 호출하면 이 생성자 안에서 서버 프로그램으로 연결 요청이 전송되고
			//그 결과 클라이언트 프로그램과 서버 프로그램의 연결이 맺어지게 된다.
			socket = new Socket("127.0.0.1", 9000);
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//데이터를 송신한다.
			//println메소드 호출 즉시 네트워크로 송신되는 것이 아니라 버퍼가 다 찰때가지
			//모아졌다가 한꺼번에 송신된다.
			//그렇기 때문에 println메소드를 호출한 다음 바로 문자열이 송신되도록 하려면
			//flush메소드를 호출해야 한다.
			writer.println("Hello, Server");
			
			writer.flush();
			
			//데이터를 수신한다.
			String str = reader.readLine();
			
			System.out.println(str);
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();			// 소켓을 닫는다.
			} catch(Exception ignored) {
				System.out.println("소켓을 닫는 중 에러가 발생했습니다.");
			}
		}
	}

}
