package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		
		if(num1 >= 1 && num1 <= 10) {
			System.out.println("정수가 1 ~ 10사이에 있습니다.");
		} else {
			System.out.println("정수가 1 ~ 10사이에 없습니다.");
		}
		
		sc.close();
	}

}
