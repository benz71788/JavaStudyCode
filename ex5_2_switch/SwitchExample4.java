package ex5_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample4 {
	
	public static void main(String[] agrs) {
		
		int result = 0;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.print("����1�� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է��ϼ���(+, -, *, /): ");
		char op = sc.next().charAt(0);
//		String op = sc.next();
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '-' :
			result = num1 - num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
		
		case '*' :
			result = num1 * num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '/' :
			result = num1 / num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		System.out.println("\n==========================\n");
		
		System.out.print("����1�� �Է��ϼ���: ");
		num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ���: ");
		num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է��ϼ���(+, -, *, /): ");
		op = sc.next().charAt(0);
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '-' :
			result = num1 - num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
		
		case '*' :
			result = num1 * num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		case '/' :
			result = num1 / num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			break;
			
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		sc.close();
	}

}
