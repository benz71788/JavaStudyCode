package ex4_1_local_variable;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02 {
	
	public static void main(String[] args) {
		int int_result;
		double dou_result;
		
		InputStream is = System.in;
		
//		클래스명   객체	연산자   생성자호출
		Scanner sc = new Scanner(is);
		
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요?");
		int a = sc.nextInt();
		
		System.out.println("입력값은 " + a + "입니다.");
		
		System.out.print("두번째 정수를 입력하세요?");
		int b = sc.nextInt();
		System.out.println("입력값은 " + b + "입니다.");
		
		int_result = a + b;
		System.out.println("두 수의 합은 " + int_result);
		
		System.out.println("===============================");
		
		System.out.print("첫번째 실수를 입력하세요?");
		double c = sc.nextDouble();
		
		System.out.println("입력값은 " + c + "입니다.");
		
		System.out.print("두번째 실수값을 입력하세요?");
		double d = sc.nextDouble();
		
		System.out.println("입력값은 " + d + "입니다.");
		
		dou_result = c + d;
		System.out.println("두 수의 합은 " + dou_result);
		
		sc.close();
		
	}

}
