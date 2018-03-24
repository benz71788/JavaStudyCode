package ex18_8_PrintWriter;

import java.io.*;

/*
 * PrintWriter Ŭ���� �̿��� ���α׷����� �����غ���
 * PrintWriter Ŭ������ �����͸� �����ؼ� ���Ϸ� ����ϴ� ����� �ִ� Ŭ�����̴�.
 */

class PrintWriterExample1_resource {
	
	public static void main(String[] args) {
		
		try (
				PrintWriter writer = new PrintWriter("print.txt");
				){
			//String ó��
			String s = "������ �� ���� �ƴ� ���� ���� ��";
			writer.println(s);
			
			//char �迭 ó��
			char[] arr = {'��', '��', '��', ' ', '��', ' ', '��', '��', ' ',
					'��', '��', ' ', '��', '��', ' ', '��', '��', ' ', '��'};
			writer.println(arr);
			
			} catch(IOException ioe) {
				System.out.println("������ ����� �� �����ϴ�.");
		}
	}
}
