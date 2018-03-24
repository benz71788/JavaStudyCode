package ex18_1_FileReader;

import java.io.*;

class FileReaderExample1 {
	
	public static void main(String[] args) {
		//1. ������ ����.
		try {
//			FileReader reader = new FileReader("poem.txt");
			FileReader reader = new FileReader("src/ex18_1_FileReader/poem.txt");
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
			
			//3. ������ �ݴ´�.
			reader.close();

		} catch(FileNotFoundException e){	//FileReader()�����ڰ� �߻��� Exception
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {			//read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}

}
