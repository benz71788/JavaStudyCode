package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class CompExample4 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		// Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("첫 번째 정수는 " + num1 + ", 두 번째 정수는 " + num2 + "를 입력하였습니다.");
		
		if(num1 != num2) {
			System.out.println("다른 수를 입력하였습니다.");
		} else {
			System.out.println("같은 수를 입력하였습니다.");
		}
		
		sc.close();
		
	}

}
