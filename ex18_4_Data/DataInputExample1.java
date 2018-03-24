package ex18_4_Data;

import java.io.*;

/*
 *DataInputStream Ŭ���� ��� ��
 *
 *DataOutputStream Ŭ������ �̿��Ͽ� ���Ͽ� �����ߴ� �����͸� ���α׷�����
 *�ٽ� �о���� ���ؼ��� DataInputStream Ŭ������ �̿��ؾ� �Ѵ�.
 *
 *������ �� Ŭ������ ���Ͽ� �����͸� �д� ����� ���� ������
 *FileInputStream Ŭ������ �Բ� ����ؾ� �Ѵ�.
 */
class DataInputExample1 {
	
	public static void main(String[] args) {
		
		DataInputStream in = null;
 
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));
			// public DataInputStream(InputStream in)
			
			//���Ϸκ��� ������ �о ����Ѵ�.
			while(true) {
				// �����͸� �дٰ� ���� ���� ������ EOFException�� �߻��Ѵ�.
				int data = in.readInt();
				
				System.out.println(data);
			}
		
		} catch(EOFException eofe) {	//readInt()�޼ҵ忡 ���� ������ ���� �����Ѵ�.
										// �̰����� �̵�
			System.out.println("��");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {
				if(in != null) in.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
