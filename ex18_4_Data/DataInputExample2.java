package ex18_4_Data;

import java.io.*;

class DataInputExample2 {
	
	public static void main(String[] args) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(
					new FileInputStream("output1.dat"));
			
			String data = in.readUTF();
			
			System.out.println(data);
			
		} catch(FileNotFoundException ioe){
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(EOFException fn) {
			System.out.println("끝");
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if(in != null) in.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
