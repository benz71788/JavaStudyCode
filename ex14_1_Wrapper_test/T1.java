package ex14_1_Wrapper_test;

import java.util.Scanner;

public class T1 {
	
	public static void main(String[] args) {
		String a, b;
		int max, min;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요? ");
		a = sc.next();
		b = sc.next();
		
		max = max(Integer.parseInt(a), Integer.parseInt(b));
		min = min(Integer.parseInt(a), Integer.parseInt(b));
		
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		
		sc.close();
		
	}
	
	public static int max(int a, int b) {
		int max;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}
	
	public static int min(int a, int b) {
		int min;
		if(a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}

}
