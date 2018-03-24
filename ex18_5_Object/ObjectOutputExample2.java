package ex18_5_Object;

import java.io.*;
import java.util.StringTokenizer;

//StringTokenizer : 객체 직렬화 불가능 클래스
class ObjectOutputExample2 {
	
	public static void main(String[] args) {
		System.out.println("*** 프로그램시작 ***");
		ObjectOutputStream out = null;
		FileOutputStream Fileout = null;
		
		try {
			Fileout = new FileOutputStream("output3.dat");
			out = new ObjectOutputStream(Fileout);
			System.out.println("파일을 열었습니다.");
			
			out.writeObject(new StringTokenizer("a|b|c", "|"));
			System.out.println("파일로 StringTokenizer 객체를 출력합니다.");
		} catch(FileNotFoundException fnfe) { 
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다.");
			ioe.printStackTrace();
		} finally {
			try {
				out.close();
				Fileout.close();
				System.out.println("파일을 닫았습니다.");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
