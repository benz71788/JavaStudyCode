package ex18_4_Data;

import java.io.*;

/*
 * DataOutputStream Ŭ������ ��� ��
 * DataOutputStream Ŭ������ �⺻�� �����͸� ����Ʈ ��Ʈ������ ����
 * ����ϴ� ����� Ŭ�����̴�.
 * �� Ŭ������ ���Ͽ� �����͸� ���� ����� ���� ������
 * FileOutputStream Ŭ������ �Բ� ����ؾ�
 * �⺻�� �����͸� ���Ͽ� �� �� �ִ�.
 * ������ ���� FileOutputStream ��ü�� ������ ��
 * �� ��ü�� ������ �Ķ���ͷ� �Ѱܾ� �Ѵ�.
 */
class DataOutputExample1 {
	
	public static void main(String[] args) {
		
		DataOutputStream out = null;

		try {
			out = new DataOutputStream(
					new FileOutputStream("output.dat"));	//������ ����.
			int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			for(int cnt = 0; cnt < arr.length; cnt++) {
				out.writeInt(arr[cnt]);	//���Ͽ� int Ÿ�� �����͸� ����.
				System.out.printf("%d \t", arr[cnt]);
			}
			System.out.println();
		} catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				if(out != null) out.close();
				System.out.println("output.dat ������ ����Ѵ�.");
			} catch(Exception e){
				
			}
			
		}
	}

}
