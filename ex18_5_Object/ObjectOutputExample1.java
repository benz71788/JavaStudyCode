package ex18_5_Object;

import java.io.*;
import java.util.*;
// ObjectOutputStream 클래스를 이용하여 객체를 파일에 저장하는 예
class ObjectOutputExample1 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			//파일을 연다
			//ObjectOutputStream 클래스는 객체를 스트림으로 만들어서
			//출력하는 기능이 있는 클래스이다.
			//이 클래스에서 데이터를 파일에 저장하는 기능이 없기 때문에
			//FileOutputStream 클래스와 함께 사용해야 한다.
			//FileOutputStream 객체를 생성해서
			
			out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
			
			//객체를 직렬화 하는 부분
			//writeObject 메소드: 파라미터로 넘겨준 객체를 스트림으로 만들어서
			//출력하는 메소드
			//파라미터로 넘겨진 객체가 파일에 저장된다.
			//GregorianCalendar객체를 생성해서 파일에 쓴다.
			out.writeObject(new GregorianCalendar(2018, 2, 5));
			out.writeObject(new GregorianCalendar(2018, 2, 6));
			out.writeObject(new GregorianCalendar(2018, 2, 7));
		} catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if(out != null) out.close();
			} catch(Exception e) {
				
			}
			
		}
	}

}
