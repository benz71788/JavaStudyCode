package ex18_3_FileInputStream_FileOutputStream;

import java.io.*;

class FileInputStreamExample {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("���ϸ��� Arguments�ǿ� output1.dat�Է��� �ּ���");
			return;
		}
		FileInputStream in = null;
		try {

			in = new FileInputStream(args[0]);	//������ ����.
			// Run -> Run Configurations���� �Ű����� ������ output1.data �Է�
			
			byte arr[] = new byte[20];	//����Ʈ ������ �����͸� �б� ������ byte
			while(true) {
				int num = in.read(arr); //���Ϸκ��� 20����Ʈ �д´�.
				// int java.io.FileInputStream.read(byte[] b) throws IOException
				if(num < 0) {	// �о� �� �����Ͱ� -1�̸� �ݺ��� �ߴ�
					break;
				}
				
				System.out.println("16���� ���");
				// �о���� ����Ʈ �����͸� 16������ ����Ѵ�.
				for(int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%02X ", arr[cnt]);
					// %02X : 2�ڸ� 16����(%X)�� ����ϵ�,
					// �빮��(X�� �빮����)�� ����ϸ鼭 ���ڰ� �� �ڸ��̸� ���ڸ���
					// 0���� ä���.
					// %02x : 2�ڸ� 16����(%x)�� ����ϵ�,
					// �ҹ���(x�� �ҹ�����)�� ����ϸ鼭 ���ڰ� �� �ڸ��̸� ���ڸ���
					// 0���� ä���.
				}
				
				System.out.println("\n\n10���� ���");
				for(int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%d ", arr[cnt]);
				}
				
				System.out.println("\n\n8���� ���");
				for(int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%o ", arr[cnt]);
				}
			}
		} catch(FileNotFoundException fnfe){
			System.out.println(args[0] + " ������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println(args[0] + " ������ ���� �� �����ϴ�.");
		} finally {
			try {
				if(in != null) in.close();	//������ �ݽ��ϴ�.
			} catch(Exception e){
				
			}
			
		}
	}

}
