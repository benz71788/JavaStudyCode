package ex6_3_method_intro;

import java.io.InputStream;
import java.util.Scanner;

public class MethodExample_1_4 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���� �ΰ��� �Է��ϼ���.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = add(num1, num2);
		
		System.out.println("���� : " + num1 + " + " + num2 + " = " + result);
		
		sc.close();
	}
	
	public static int add(int num1, int num2) {
		
		int sum = 0;
		
		sum = num1 + num2;
		
		return sum;
	}

}
