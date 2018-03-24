package ex18_3_FileInputStream_FileOutputStream;

import java.io.*;

class FileKoalaExample {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("파일명을 Arguments탭에 koala.jpg 입력해주세요");
		}
		
		String originalFileName = "koala.jpg";
		String targetFileName = "koala3.jpg";
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(originalFileName);
			out = new FileOutputStream(targetFileName);
			byte arr[] = new byte[128];
			while(true) {
				int num = in.read(arr);
				if(num < 0) {
					break;
				}
				
				for(int cnt = 0; cnt < num; cnt++) {
					out.write(arr[cnt]);
				}
				
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
