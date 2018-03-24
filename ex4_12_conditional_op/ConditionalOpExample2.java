package ex4_12_conditional_op;

import java.io.InputStream;
import java.util.Scanner;

public class ConditionalOpExample2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("3개의 수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max_result1 = num1 > num2 ? num1 : num2;
		int max_result2 = max_result1 > num3 ? max_result1 : num3;
		
		int min_result1 = num1 < num2 ? num1 : num2;
		int min_result2 = min_result1 < num3 ? min_result1 : num3;
		
		System.out.println();
		System.out.println("max = " + max_result2);
		System.out.println("min = " + min_result2);
		
		int max_result3 = (num1 < num2) ? (num2 < num3 ? num3 : num2) : (num1 < num3 ? num3 : num1);
		int min_result3 = (num1 > num2) ? (num2 > num3 ? num3 : num2) : (num1 > num3 ? num3 : num1);
		
		System.out.println();
		System.out.println("max = " + max_result3);
		System.out.println("min = " + min_result3);
		
		sc.close();
	}

}
