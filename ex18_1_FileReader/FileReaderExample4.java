package ex18_1_FileReader;

import java.io.*;

class FileReaderExample4 {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
		char arr[] = new char[1000];
		try {
			reader = new FileReader("src/ex18_1_FileReader/거위의 꿈.txt");
			int num = reader.read(arr);
			System.out.println("읽어온 문자 수 = " + num);
			
			//출력방법 1. arr의 0부터 num개 만큼 스트링으로 만든 후 출력
			System.out.print(new String(arr, 0, num));
			
			//출력방법 2.			
			/*
			for(int i = 0; i < num; i++) {
				System.out.print(arr[i]);
			}
			*/
			
			  
			 
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
