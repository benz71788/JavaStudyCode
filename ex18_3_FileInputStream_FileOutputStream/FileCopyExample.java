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
				out.write(readBytes);	//128바이트를 출력 스트림으로 보낸다.
				
				//2. write(byte[] b, int off, int len)
				//	out.write(readBytes, 0, readCount);
				//배열 readBytes[0]부터 readCount만큼의 바이트를 출력스트림으로 보낸다.
			}
			System.out.println("복사 되었습니다.");
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch(Exception e) {
				
			}
		}
	}
}
