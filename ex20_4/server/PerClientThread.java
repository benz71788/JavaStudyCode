package ex20_4.server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	//ArrayList객체를 여러 스레드가 동시에 사용하게 되면 문제가 발생할 수 있어
	//안전하게 공유할 수 있는 동기화된 리스트로 만든다.
	//동기화된 리스트로 만들기 위해 java.util.Collections 클래스의 
	//synchronizedList메서드를 이용한다.
	static List<PrintWriter> list
		= Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket;
	PrintWriter writer;
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer); //리스트에 소켓의 출력 스트림을 등록한다.
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
			 * SenderThread.java에서
			 * writer.println(name);
			 * writer.flush();
			 * 		로 보낸 name을 아래의 문장에서 읽어온다.
			 */
			//수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장한다.
			name = reader.readLine();
			sendAll("#" + name + "님이 들어오셨습니다.");
			System.out.println("#" + name + "님이 들어오셨습니다.");
			
			while(true) {
				String str = reader.readLine();
				
				//소켓의 연결이 끊어지면 null을 리턴한다.
				if(str == null) {
					break;
				}
				//수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신한다.
				sendAll(name + "> " + str);
				System.out.println(name + "> " + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			list.remove(writer);
			//사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보낸다.
			sendAll("#" + name + "님이 나가셨습니다.");
			System.out.println("#" + name + "님이 나가셨습니다.");
			
			try {
				socket.close();
			} catch(Exception ignored) {
				System.out.println("소켓 닫는 중에 에러가 발생하였습니다.");
			}
		}
	}
	
	//서버에 연결된 모든 클라이언트로 똑같은 메세지를 보낸다.
	public void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}
	
	
}
