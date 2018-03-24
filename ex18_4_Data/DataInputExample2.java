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
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch(EOFException fn) {
			System.out.println("��");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {
				if(in != null) in.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
