package ex18_5_Object;

import java.io.*;
import java.util.StringTokenizer;

//StringTokenizer : ��ü ����ȭ �Ұ��� Ŭ����
class ObjectOutputExample2_resource {
	
	public static void main(String[] args) {
		System.out.println("*** ���α׷����� ***");
		
		try (
			FileOutputStream Fileout = new FileOutputStream("output3.dat");
			ObjectOutputStream out = new ObjectOutputStream(Fileout);
				){
			System.out.println("������ �������ϴ�.");
			
			out.writeObject(new StringTokenizer("a|b|c", "|"));
			System.out.println("���Ϸ� StringTokenizer ��ü�� ����մϴ�.");
		} catch(FileNotFoundException fnfe) { 
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");
			ioe.printStackTrace();
		}
	}

}
