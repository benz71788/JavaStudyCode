package ex18_5_Object;

import java.io.*;
import java.util.StringTokenizer;

//StringTokenizer : ��ü ����ȭ �Ұ��� Ŭ����
class ObjectOutputExample2 {
	
	public static void main(String[] args) {
		System.out.println("*** ���α׷����� ***");
		ObjectOutputStream out = null;
		FileOutputStream Fileout = null;
		
		try {
			Fileout = new FileOutputStream("output3.dat");
			out = new ObjectOutputStream(Fileout);
			System.out.println("������ �������ϴ�.");
			
			out.writeObject(new StringTokenizer("a|b|c", "|"));
			System.out.println("���Ϸ� StringTokenizer ��ü�� ����մϴ�.");
		} catch(FileNotFoundException fnfe) { 
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");
			ioe.printStackTrace();
		} finally {
			try {
				out.close();
				Fileout.close();
				System.out.println("������ �ݾҽ��ϴ�.");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
