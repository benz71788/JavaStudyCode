package ex4_1_local_variable;

import java.util.Scanner;

public class Oper02_1 {
	
	public static void main(String[] args) {
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수값을 입력하세요?");
		int a = sc.nextInt();
		
		System.out.println("두번째 정수값을 입력하세요?");
		int b = sc.nextInt();
		
		result = a + b;
		
		System.out.println("두 수의 합은 " + result);
	}

}
