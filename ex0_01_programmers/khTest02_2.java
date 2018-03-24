package ex0_01_programmers;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Set;

public class khTest02_2 {
	
	public static void main(String[] args) {
		HashMap<String, Book> map = new HashMap<String, Book>();
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
		
//		2차원 정변배열에 들어있는 데이터들의 합계와 평균을 구한다. 
//
//		1. 사용 데이터 
//		 int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
//
//		2. 구현 클래스  
//		Package명         클래스명       메소드                                      설명
//		array                Test1            +main(args:String []):void         main 함수 안에서 모든 코드 작업 진행
//
//		3. 실행 결과  
//		출력 결과는 다음과 같다.   
//		합계 : 602.0 
//		평균 : 37.625  
//		합계와 평균 값은 double로 처리 한다.  
		
	}

}

