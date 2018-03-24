package ex18_5_Object;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

class ObjectInputExample1 {
	
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			
			while(true) {
				//��ü�� ������ȭ�ϴ� �κ�
				//readObject �޼ҵ� : �Էµ� ��Ʈ�����κ��� ��ü�� ���� �����ϴ� �޼ҵ�.
				//����Ÿ��(Object)
				//����Ÿ�� Object�� ���� �� Ŭ���� Ÿ������ ����ϱ� ����
				//ĳ��Ʈ ������ �ؾ��Ѵ�.
				//readObject()�� Object���̹Ƿ� GregorianCalendar Ÿ������ �� ��ȯ �ؾ� �Ѵ�.
				GregorianCalendar calendar = (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH) + 1;
				int date = calendar.get(Calendar.DATE);
				
				System.out.println(year + "/" + month + "/" + date);
			}
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (EOFException eof) {	//���Ϸ� ���� ���̻� ���� ��ü�� ����  �� �߻�
			System.out.println("��");
		} catch (ClassNotFoundException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				if(in != null) in.close();
			} catch(Exception e) {
				
			}
			
		}
	}

}
