package ex18_1_FileReader;

import java.io.*;

class FileReaderExample4 {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
		char arr[] = new char[1000];
		try {
			reader = new FileReader("src/ex18_1_FileReader/������ ��.txt");
			int num = reader.read(arr);
			System.out.println("�о�� ���� �� = " + num);
			
			//��¹�� 1. arr�� 0���� num�� ��ŭ ��Ʈ������ ���� �� ���
			System.out.print(new String(arr, 0, num));
			
			//��¹�� 2.			
			/*
			for(int i = 0; i < num; i++) {
				System.out.print(arr[i]);
			}
			*/
			
			  
			 
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
