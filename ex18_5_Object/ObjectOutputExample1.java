package ex18_5_Object;

import java.io.*;
import java.util.*;
// ObjectOutputStream Ŭ������ �̿��Ͽ� ��ü�� ���Ͽ� �����ϴ� ��
class ObjectOutputExample1 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			//������ ����
			//ObjectOutputStream Ŭ������ ��ü�� ��Ʈ������ ����
			//����ϴ� ����� �ִ� Ŭ�����̴�.
			//�� Ŭ�������� �����͸� ���Ͽ� �����ϴ� ����� ���� ������
			//FileOutputStream Ŭ������ �Բ� ����ؾ� �Ѵ�.
			//FileOutputStream ��ü�� �����ؼ�
			
			out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
			
			//��ü�� ����ȭ �ϴ� �κ�
			//writeObject �޼ҵ�: �Ķ���ͷ� �Ѱ��� ��ü�� ��Ʈ������ ����
			//����ϴ� �޼ҵ�
			//�Ķ���ͷ� �Ѱ��� ��ü�� ���Ͽ� ����ȴ�.
			//GregorianCalendar��ü�� �����ؼ� ���Ͽ� ����.
			out.writeObject(new GregorianCalendar(2018, 2, 5));
			out.writeObject(new GregorianCalendar(2018, 2, 6));
			out.writeObject(new GregorianCalendar(2018, 2, 7));
		} catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				if(out != null) out.close();
			} catch(Exception e) {
				
			}
			
		}
	}

}
