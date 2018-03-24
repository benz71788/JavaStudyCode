package ex18_1_FileReader;

import java.io.*;

/*
 * 1. try-with-resource문으로 try()괄호 안에 선언된 자원은
 *		try문이 끝날 때 자동으로 close()메서드를 호출한다.
 *
 * 2. try-with-resource문에 의해 자동으로
 * 		객체의 close()가 호출될 수 있으려면 클래스가
 * 		AutoCloseable이라는 인터페이스를 구현한 것이어야 한다.
 * 	형식) try(){
 * 		......
 * 		} catch(){}
 * 		 finally{}
 */
class FileReaderExample5_3_try_witg_resource {
	
	public static void main(String[] args) {
		char arr[] = new char[64];
		try (FileReader reader = new FileReader("거위의 꿈.txt");){
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
		}
	}

}
