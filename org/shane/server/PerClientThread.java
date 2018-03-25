package org.shane.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	
	static List<PrintWriter> list 
		= Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket = null;
	PrintWriter writer;
	
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			name = reader.readLine();
			sendAll(name);
			System.out.println("#" + name + "님이 입장하셨습니다.");
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				sendAll(name + "> " + str);
				System.out.println(name + "> " + str);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			list.remove(writer);
			sendAll(name + "님이 퇴장하셨습니다.");
			System.out.println(name + "님이 퇴장하셨습니다.");
		} 
	}
	
	public void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}

}
