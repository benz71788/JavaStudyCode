package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class CompExample3 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("두 수를 입력해야 합니다.");
		System.out.print("첫번째 정수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("첫번째 정수는 " + num1 + "입니다.");
		
		System.out.print("두번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.println("두번째 정수는 " + num2 + "입니다.");
		System.out.println();
		
		if (num1 > num2) {
			System.out.println("첫번째 정수인 " + num1 + "이 가장 큰 수 입니다.");
		}
		
		if (num1 < num2) {
			System.out.println("두번째 정수인 " + num2 + "이 가장 큰 수 입니다.");
		}
		
		sc.close();
	}

}
