package ex18_1_FileReader;

import java.io.*;

class FileReaderExample5 {
	
	public static void main(String[] args) {
		FileReader reader = null;
		char arr[] = new char[64];
		try {
			reader = new FileReader("src/ex18_1_FileReader/������ ��.txt");
			
			while(true) {
				int num = reader.read(arr);
				if(num == -1) {	//�� �̻� ���� �����Ͱ� ���� ��� -1�� �����Ѵ�.
					break;
				}
				
				for(int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%c", arr[cnt]);
				}
			}
		} catch(FileNotFoundException e){	//FileReader()�����ڰ� �߻��� Exception
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {			//read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		} catch(NullPointerException n) { 	//Exception - RuntimeException
			System.out.println("NullPointerException ���ܹ߻�");
		} finally {
			try {
				reader.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
