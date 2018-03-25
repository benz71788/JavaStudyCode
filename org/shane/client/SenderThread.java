package org.shane.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	
	Socket socket;
	String name;
	SenderThread(Socket socket, String name){
		this.socket = socket;
		this.name = name;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			writer.println(name);
			writer.flush();

			while(true) {
				String str = reader.readLine();
				if(str.equals("exit")) {
					break;
				}
				
				writer.println(str);
				writer.flush();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch(Exception ignored) {
				System.out.println("소켓 종료 중 에러가 발생하였습니다.");
			}
			
		}
	}

}
