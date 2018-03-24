package ex5_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample4 {
	
	public static void main(String[] agrs) {
		
		int result = 0;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.print("정수1를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("정수2를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요(+, -, *, /): ");
		char op = sc.next().charAt(0);
//		String op = sc.next();
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '-' :
			result = num1 - num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
		
		case '*' :
			result = num1 * num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '/' :
			result = num1 / num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("\n==========================\n");
		
		System.out.print("정수1를 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("정수2를 입력하세요: ");
		num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요(+, -, *, /): ");
		op = sc.next().charAt(0);
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '-' :
			result = num1 - num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
		
		case '*' :
			result = num1 * num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '/' :
			result = num1 / num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
