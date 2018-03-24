package ex12_1_Exception;

import java.io.*;

class ExceptionExample8 {
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		}
	}

}
