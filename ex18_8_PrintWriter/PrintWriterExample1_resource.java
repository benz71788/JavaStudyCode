package ex18_8_PrintWriter;

import java.io.*;

/*
 * PrintWriter 클래스 이용한 프로그램으로 수정해보기
 * PrintWriter 클래스는 데이터를 포맷해서 파일로 출력하는 기능이 있는 클래스이다.
 */

class PrintWriterExample1_resource {
	
	public static void main(String[] args) {
		
		try (
				PrintWriter writer = new PrintWriter("print.txt");
				){
			//String 처리
			String s = "내꺼인 듯 내꺼 아닌 내꺼 같은 너";
			writer.println(s);
			
			//char 배열 처리
			char[] arr = {'내', '꺼', '인', ' ', '듯', ' ', '내', '꺼', ' ',
					'아', '닌', ' ', '내', '꺼', ' ', '같', '은', ' ', '너'};
			writer.println(arr);
			
			} catch(IOException ioe) {
				System.out.println("파일을 출력할 수 없습니다.");
		}
	}
}
