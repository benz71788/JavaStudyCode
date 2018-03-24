package ex18_1_FileReader;

import java.io.*;

class FileReaderExample3 {
	
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			//1. ������ ����.	
			reader = new FileReader("src/ex18_1_FileReader/poem.txt");
//			FileReader reader = new FileReader("poem.txt");
			
			//����� ���� - D:/CODE/java_sh �ǹ�
			
//			FileReader reader1 = new FileReader("D:\\CODE\\java_sh\\src\\ex18_1_FileReader\\poem.txt");
			//������ ����
			
			//2. ������ �о ó���ϴ� �κ�
			while(true) {
				int data = reader.read(); //���Ͽ� �ִ� ���� �ϳ��� �о �����Ѵ�.
				if(data == -1) { //�� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				char ch = (char)data;
				System.out.print(ch);
			}
			

		} catch(FileNotFoundException e){	//FileReader()�����ڰ� �߻��� Exception
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {			//read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		} catch(NullPointerException n) { 	//Exception - RuntimeException
			System.out.println("NullPointerException ���ܹ߻�");
		} finally {		//������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ͽ��� 
			try {
				
				//3. ������ �ݴ´�.
				reader.close();	//������ �ݴ� ��ɹ�
			} catch(Exception e) {	//close�޼ҵ尡 �߻��ϴ� ����ó��
									//IOException�� NullPointerException
				e.printStackTrace();
			}
		}
	}

}
