package ex5_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample3_2 {
	
	public static void main(String[] args) {
		int max, min;
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("세 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 + "인 첫번째 입력값이 제일 큽니다.");
			}
		} else if(num2 > num3) {
			if(num2 > num1) {
				System.out.println(num2 + "인 두번째 입력값이 제일 큽니다.");
			}
		} else if(num3 > num1) {
			if(num3 > num2) {
				System.out.println(num3 + "인 세번째 입력값이 제일 큽니다.");
			}
		}
		
		if(num1 < num2) {
			if(num1 < num3) {
				System.out.println(num1 + "인 첫번째 입력값이 제일 작습니다.");
			}
		} else if(num2 < num3) {
			if(num2 < num1) {
				System.out.println(num2 + "인 두번째 입력값이 제일 작습니다.");
			}
		} else if(num3 < num1) {
			if(num3 < num2) {
				System.out.println(num3 + "인 세번째 입력값이 제일 작습니다.");
			}
		}
		
		System.out.println("\n===================================\n");
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
			System.out.println(num1 + "인 첫번째 입력값이 제일 큽니다.");
		} else if(num2 > num1 && num2 > num3) {
			max = num2;
			System.out.println(num2 + "인 두번째 입력값이 제일 큽니다.");
		} else {
			max = num3;
			System.out.println(num3 + "인 세번째 입력값이 제일 큽니다.");
		}
		
		if(num1 < num2 && num1 < num3) {
			min = num1;
			System.out.println(num1 + "인 첫번째 입력값이 제일 작습니다.");
		} else if(num2 < num1 && num2 < num3) {
			min = num2;
			System.out.println(num2 + "인 두번째 입력값이 제일 작습니다.");
		} else {
			min = num3;
			System.out.println(num3 + "인 세번째 입력값이 제일 작습니다.");
		}
		
		System.out.println("\n===================================\n");
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		sc.close();
	}

}
