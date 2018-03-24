package ex18_4_Data;

import java.io.*;

class DataOutputExample2 {
	
	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					new FileOutputStream("output1.dat"));
			
			out.writeUTF("��ſ� ������ �Դϴ�.~");
		} catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� ����.");
		} finally {
			try {
				if(out != null) out.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
