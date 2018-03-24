package ex14_1_Wrapper_test;

import java.util.Scanner;

public class T2 {
	
	public static void main(String[] args) {
		String a, b;
		int max, min;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요? ");
		a = sc.next();
		b = sc.next();
		
		max = max(Integer.valueOf(a), Integer.valueOf(b));
		min = min(Integer.valueOf(a), Integer.valueOf(b));
		
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
