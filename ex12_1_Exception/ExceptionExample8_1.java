package ex12_1_Exception;

import java.io.FileReader;
import java.io.IOException;


//상속 관계에 있는 두 종류의 Exception을 처리하는 try~catch문
//예외 처리 순서가 자식에서 부모 순으로 작성한다.
//FileNotFoundException -> IOException
//이 중 발생한 예외의 종류와 일치하는 단 한개의 catch불럭만 수행된다.
class ExceptionExample8_1 {
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch(IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		}
		//이미 부모 IOException에서 자식 FileNotFoundException도
		//처리할 수 있기 때문에 이 부분이 필요없다.
//		catch(FileNotFoundException e) {
//			System.err.println("파일을 찾을 수 없습니다.");
//		}
	}

}
