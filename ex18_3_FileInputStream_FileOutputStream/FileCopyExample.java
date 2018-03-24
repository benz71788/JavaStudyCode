package ex18_3_FileInputStream_FileOutputStream;

import java.io.*;

class FileCopyExample {
	public static void main(String[] args) {
		
		String originalFileName = "koala.jpg";
		String targetFileName = "koala3.jpg";
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(originalFileName);
			out = new FileOutputStream(targetFileName);
			
			int readCount;
			byte readBytes[] = new byte[128];
			while((readCount = in.read(readBytes)) != -1) {
				//1. write(byte[] b)
				out.write(readBytes);	//128����Ʈ�� ��� ��Ʈ������ ������.
				
				//2. write(byte[] b, int off, int len)
				//	out.write(readBytes, 0, readCount);
				//�迭 readBytes[0]���� readCount��ŭ�� ����Ʈ�� ��½�Ʈ������ ������.
			}
			System.out.println("���� �Ǿ����ϴ�.");
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch(Exception e) {
				
			}
		}
	}
}
