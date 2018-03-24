package ex18_6_Buffered;

import java.io.*;

/*
 * java.lang.Object
 * 		java.io.OutputStream
			java.io.FilterOutputStream
				java.io.BufferedOutputStream
	���۸� �̿��Ͽ� ����Ʈ ��� ��Ʈ���� ������ ����Ű�� Ŭ������
	������ ���� �����ڸ� ���� �ִ�.
	1. BufferedOutputStream(OutputStream out)
				- size�� ���� ��� 8192����Ʈ ũ���� ���۸� ���´�.
	2. BufferedOutputStream(OutputStream out, int size)
 */
	

class BufferedOutputStreamExample {
	public static void main(String[] args) {
		try(
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("output.txt"));
			){
			//������ ����.
			byte[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
					10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
			
			//������ �ݺ��ؼ� byteŸ�� �����͸� ����.
			for(int cnt = 0; cnt < arr.length; cnt++) {
				out.write(arr[cnt]);
			}
			
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}
