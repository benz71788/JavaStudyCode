package ex0_01_programmers;

import java.io.*;

public class khTest02_1 {
	
	public static void main(String[] args) {
		String fileName = "������ ��.txt";
		fileOpen(fileName);

	}
	
	public static void fileOpen(String fileName) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName));){
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				
				String[] st = str.split(" ");
				
				for(int i = 0; i < st.length; i++) {
					System.out.print(st[i] + " ");
				}
			}
		} catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}

	 }

}
