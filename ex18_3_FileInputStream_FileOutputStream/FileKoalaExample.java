package ex18_3_FileInputStream_FileOutputStream;

import java.io.*;

class FileKoalaExample {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("���ϸ��� Arguments�ǿ� koala.jpg �Է����ּ���");
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
