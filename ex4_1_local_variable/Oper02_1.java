package ex4_1_local_variable;

import java.util.Scanner;

public class Oper02_1 {
	
	public static void main(String[] args) {
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° �������� �Է��ϼ���?");
		int a = sc.nextInt();
		
		System.out.println("�ι�° �������� �Է��ϼ���?");
		int b = sc.nextInt();
		
		result = a + b;
		
		System.out.println("�� ���� ���� " + result);
	}

}
