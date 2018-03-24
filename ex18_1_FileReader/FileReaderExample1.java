package ex18_1_FileReader;

import java.io.*;

class FileReaderExample1 {
	
	public static void main(String[] args) {
		//1. 파일을 연다.
		try {
//			FileReader reader = new FileReader("poem.txt");
			FileReader reader = new FileReader("src/ex18_1_FileReader/poem.txt");
			//상대경로 지정 - D:/CODE/java_sh 의미
			
//			FileReader reader1 = new FileReader("D:\\CODE\\java_sh\\src\\ex18_1_FileReader\\poem.txt");
			//절대경로 지정
			
			//2. 파일을 읽어서 처리하는 부분
			while(true) {
				int data = reader.read(); //파일에 있는 문자 하나를 읽어서 리턴한다.
				if(data == -1) { //더 이상 읽을 데이터가 없는 경우
					break;
				}
				char ch = (char)data;
				System.out.print(ch);
			}
			
			//3. 파일을 닫는다.
			reader.close();

		} catch(FileNotFoundException e){	//FileReader()생성자가 발생할 Exception
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) {			//read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}
