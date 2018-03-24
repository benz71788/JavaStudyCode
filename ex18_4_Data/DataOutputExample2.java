package ex18_4_Data;

import java.io.*;

class DataOutputExample2 {
	
	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					new FileOutputStream("output1.dat"));
			
			out.writeUTF("즐거운 월요일 입니다.~");
		} catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없다.");
		} finally {
			try {
				if(out != null) out.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
