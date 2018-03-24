package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample3 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		
		if(num1 == 1 || num1 == 11) {
			System.out.println("입력한 수가 1 또는 11입니다.");
		} else {
			System.out.println("입력한 수가 1 또는 11이 아닙니다.");
		}
		
		sc.close();
	}

}
