package ex4_1_local_variable;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02 {
	
	public static void main(String[] args) {
		int int_result;
		double dou_result;
		
		InputStream is = System.in;
		
//		Ŭ������   ��ü	������   ������ȣ��
		Scanner sc = new Scanner(is);
		
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ���?");
		int a = sc.nextInt();
		
		System.out.println("�Է°��� " + a + "�Դϴ�.");
		
		System.out.print("�ι�° ������ �Է��ϼ���?");
		int b = sc.nextInt();
		System.out.println("�Է°��� " + b + "�Դϴ�.");
		
		int_result = a + b;
		System.out.println("�� ���� ���� " + int_result);
		
		System.out.println("===============================");
		
		System.out.print("ù��° �Ǽ��� �Է��ϼ���?");
		double c = sc.nextDouble();
		
		System.out.println("�Է°��� " + c + "�Դϴ�.");
		
		System.out.print("�ι�° �Ǽ����� �Է��ϼ���?");
		double d = sc.nextDouble();
		
		System.out.println("�Է°��� " + d + "�Դϴ�.");
		
		dou_result = c + d;
		System.out.println("�� ���� ���� " + dou_result);
		
		sc.close();
		
	}

}
