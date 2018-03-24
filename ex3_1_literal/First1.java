package ex3_1_literal;

public class First1 {
	
	public static void main(String[] args) {
		
		/*
		System.out.println() : 괄호안의 내용을 출력한 후 한 행을 띄웁니다.
		
		System.out.print() : 괄호안의 내용을 출력한 후 한 행을 띄우지 않고 유지하니다.
		
		System.out.printf() : 서식을 지정해서 출력합니다.
		*/
		
		//리터럴(literal) - 그 자체로 값을 의미 하는것
		System.out.println("출력성공!!");
		System.out.println(30);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println(true);
		System.out.println(false);
		System.out.println("문자열 출력");
		
		System.out.print("=====줄이 안바뀜!!=====");
		System.out.print("test \n");
		
		//문자열 "자바출력"을 문자열 서식(%s)으로 출력해라.
		System.out.printf("%s", "자바출력");
		
		//실수 42.195를 실수 서식(%f)으로 출력해라.
		//(기본 소수점이하 6자리)
		System.out.printf("%f", 42.195);
		System.out.println();
		
		//실수 42.195를 실수 서식 소수점 이하 2자리(%.2f)로 출력해라.
		System.out.printf("%.2f\n", 42.195);
		
		// 정수 42를 정수 서식(%d)으로 출력해라.
		System.out.printf("%d\n", 42);
		
		//문자 'A'를 문자 서식(%c)으로 출력해라.
		System.out.printf("%c", 'A');
			
	}
	
	
}
