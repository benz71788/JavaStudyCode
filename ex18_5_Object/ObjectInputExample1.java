package ex18_5_Object;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

class ObjectInputExample1 {
	
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			
			while(true) {
				//객체를 역직렬화하는 부분
				//readObject 메소드 : 입력된 스트림으로부터 객체를 만들어서 리턴하는 메소드.
				//리턴타입(Object)
				//리턴타입 Object를 원래 의 클래스 타입으로 사용하기 위해
				//캐스트 연산을 해야한다.
				//readObject()가 Object형이므로 GregorianCalendar 타입으로 형 변환 해야 한다.
				GregorianCalendar calendar = (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH) + 1;
				int date = calendar.get(Calendar.DATE);
				
				System.out.println(year + "/" + month + "/" + date);
			}
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (EOFException eof) {	//파일로 부터 더이상 읽을 객체가 없을  때 발생
			System.out.println("끝");
		} catch (ClassNotFoundException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				if(in != null) in.close();
			} catch(Exception e) {
				
			}
			
		}
	}

}
