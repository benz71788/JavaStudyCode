package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW2_ex08 {
	
	public static void main(String[] args) {
		
		int result1 = 0;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("두 양수를 입력하세요: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			if(num1 >= num2) {
				for(int i = num2; i <= num1; i++) {
					result1 = result1 + i;
				}
				System.out.println("두 수 사이의 합은? " + result1);
			} else {
				for(int i = num1; i <= num2; i++) {
					result1 = result1 + i;
				}
				System.out.println("두 수 사이의 합은? " + result1);
			}
		} else {
			System.out.println("양수를 입력하세요");
		}
		
		sc.close();
		
	}

}
