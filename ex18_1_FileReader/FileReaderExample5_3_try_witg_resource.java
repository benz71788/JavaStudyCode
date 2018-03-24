package ex18_1_FileReader;

import java.io.*;

/*
 * 1. try-with-resource������ try()��ȣ �ȿ� ����� �ڿ���
 *		try���� ���� �� �ڵ����� close()�޼��带 ȣ���Ѵ�.
 *
 * 2. try-with-resource���� ���� �ڵ�����
 * 		��ü�� close()�� ȣ��� �� �������� Ŭ������
 * 		AutoCloseable�̶�� �������̽��� ������ ���̾�� �Ѵ�.
 * 	����) try(){
 * 		......
 * 		} catch(){}
 * 		 finally{}
 */
class FileReaderExample5_3_try_witg_resource {
	
	public static void main(String[] args) {
		char arr[] = new char[64];
		try (FileReader reader = new FileReader("������ ��.txt");){
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
		}
	}

}
