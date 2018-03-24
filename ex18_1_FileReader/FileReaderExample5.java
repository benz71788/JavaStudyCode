package ex18_1_FileReader;

import java.io.*;

class FileReaderExample5 {
	
	public static void main(String[] args) {
		FileReader reader = null;
		char arr[] = new char[64];
		try {
			reader = new FileReader("src/ex18_1_FileReader/거위의 꿈.txt");
			
			while(true) {
				int num = reader.read(arr);
				if(num == -1) {	//더 이상 읽을 데이터가 없는 경우 -1을 리턴한다.
					break;
				}
				
				for(int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%c", arr[cnt]);
				}
			}
		} catch(FileNotFoundException e){	//FileReader()생성자가 발생할 Exception
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) {			//read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} catch(NullPointerException n) { 	//Exception - RuntimeException
			System.out.println("NullPointerException 예외발생");
		} finally {
			try {
				reader.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
