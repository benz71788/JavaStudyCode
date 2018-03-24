package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

//StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램
class StringTokenizerExample1_2 {
	
	public static void main(String[] args) {
		
		System.out.println("=====구분자 공백=====");
		//StringTokenizerExample1_1 에러 해결
		StringTokenizer stok2 = new StringTokenizer("사과 배 복숭아");
		while(stok2.hasMoreTokens()) {		//토큰이 있는 동안 반복해라
			String str = stok2.nextToken();	//문자열로부터 토큰을 추출
			System.out.println(str);
		}
	}

}
