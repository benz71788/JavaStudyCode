package org.shane.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	
	Socket socket;
	PrintWriter writer;
	SenderThread(Socket socket){
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			
			String name = "Server";
			while(true) {
				String str = reader.readLine();
				if(str.equals("exit")) {
					sendAll("방이 종료되었습니다.");
					break;
				}
				
				sendAll(name + "> " + str);
				
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
	
	public void sendAll(String str) {
		for(PrintWriter writer: PerClientThread.list) {
			writer.println(str);
			writer.flush();
		}
	}

}
