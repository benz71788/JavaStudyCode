package ex18_1_FileReader;

import java.io.*;

class FileReaderExample3 {
	
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			//1. 파일을 연다.	
			reader = new FileReader("src/ex18_1_FileReader/poem.txt");
//			FileReader reader = new FileReader("poem.txt");
			
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
			

		} catch(FileNotFoundException e){	//FileReader()생성자가 발생할 Exception
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) {			//read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} catch(NullPointerException n) { 	//Exception - RuntimeException
			System.out.println("NullPointerException 예외발생");
		} finally {		//파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 
			try {
				
				//3. 파일을 닫는다.
				reader.close();	//파일을 닫는 명령문
			} catch(Exception e) {	//close메소드가 발생하는 예외처리
									//IOException과 NullPointerException
				e.printStackTrace();
			}
		}
	}

}
