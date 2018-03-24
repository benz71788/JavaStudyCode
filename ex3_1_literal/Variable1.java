package ex3_1_literal;

public class Variable1 {
	
	public static void main(String[] args) {
		//정수형변수
		//1바이트(작은 범위의 값ㅇ들 저장하기에 유용하다.)
		byte b = 10;
		short s = 100;
		int i = 1000;
		
		//8바이트(l[소문자 엘] 또는 L을 숫자 뒤에 붙인다.)
		long l = 10000L;
		b = 20;
		
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("i=" + i + ", l=" + l);
		
		//실수형 변수
		//f나 F를 숫자 뒤에 붙입니다.
		float ft = 3.14f;
		
		//d나 D를 숫자 뒤에 붙이거나 생략할 수 있습니다.
		double d = 42.195d;
		System.out.println("f=" + ft + ", d=" + d);
		
		/*
		 * 컴퓨터가 숫자밖에 모르기 때문에 문자가 숫자로 변환되어
		 * 저장되는데 어떤 기준으로 저장될까요?
		 * 문자에 해당하는 유니코드입니다.
		 * 'A' -> 65
		 * 	: 문자를 코드로 변환하는 것을 문자 인코딩(encoding)이라 한다.
		 * '65 -> 'A'
		 * 	: 코드를 문자로 변환하는 것을 문자 디코딩(decoding)이라 한다.
		 */
		
		// 문자형 변수 - 하나의 문자를 나타낼 수 있는 자료형으로
		// 16비트의 유니코드를 사용합니다.
		char c1 = 'A'; //2바이트
		char c2 = '@';
		char c3 = '홍';
		System.out.println("c1=" + c1 + ", c2=" + c2 + ", c3=" + c3);
		System.out.printf("%c\n", c1);
		System.out.printf("%d\n", (int)c1);
		System.out.printf("%c, %d\n", c1, (int)c1);
		System.out.printf("%c, %d\n", c2, (int)c2);
		System.out.printf("%c, %d\n", c3, (int)c3);
		System.out.println(c1 + c2 + c3);
		
		/*에러의 예
		 * 1. char cerror = 'AB';		두 글자 입력하면 에러
		 * 2. char cerror_blank = '';	반드시 하나의 문자가 필요
		 */
		
		//문자형에 정수를 배정하면 정수에 해당하는 유니코드를 찾아서 변수에
		char c4 = 65;			// 영문 'A'를 의미
		char c5 = '\uAC00';		// 한글 유니코드 '가'를 의미
		char c6 = '\uAC01';
		System.out.println("c4=" + c4 + ", c5=" + c5 + ", c6=" + c6);
		
		//0으로 시작하면 8진수를 의미, 0x로 시작하면 16진수를 의미한다.
		char c7 = 0101; //0으로 시작하면 8진수를 의미
		char c8 = 0x41; //0x로 시작하면 16진수를 의미
		System.out.println("8진수 0101=" + c7 + "\n" 
				+ "16진수 0x41=" + c8);
		
		//논리형 변수
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1은 참인 " + b1);
		System.out.println("b2는 거짓인 " + b2);
		
		//참조형 -s1, s2는 메모리 주소, new는 연산자,
		//new String("자바"); 에서 String()은 생성자
		String s1="자바";
		System.out.println("s1=" + s1);
		
	}

}
