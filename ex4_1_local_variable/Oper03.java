package ex4_1_local_variable;

import java.io.InputStream;
import java.util.Scanner;

public class Oper03 {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력하세요?");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + "은 짝수입니다.");
		} else {
			System.out.println(n + "은 홀수입니다.");
		}
		
		sc.close();
	}

}
