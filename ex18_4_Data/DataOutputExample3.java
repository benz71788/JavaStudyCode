package ex18_4_Data;

import java.io.*;

class DataOutputExample3 {
	
	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					new FileOutputStream("output3.dat"));
			
			out.writeUTF("즐거운 금요일 입니다.\n");
			out.writeInt(5);
			out.writeDouble(3.14);
		} catch(IOException e) {
			System.out.println("파일을 출력 할 수 없습니다.");
		} finally {
			try {
				if(out != null) out.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
