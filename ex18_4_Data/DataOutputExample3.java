package ex18_4_Data;

import java.io.*;

class DataOutputExample3 {
	
	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					new FileOutputStream("output3.dat"));
			
			out.writeUTF("��ſ� �ݿ��� �Դϴ�.\n");
			out.writeInt(5);
			out.writeDouble(3.14);
		} catch(IOException e) {
			System.out.println("������ ��� �� �� �����ϴ�.");
		} finally {
			try {
				if(out != null) out.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
