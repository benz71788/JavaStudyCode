package ex12_1_Exception;

import java.io.*;

class ExceptionExample8 {
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch(FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch(IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		}
	}

}
