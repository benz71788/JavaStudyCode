package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class CompExample3 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("�� ���� �Է��ؾ� �մϴ�.");
		System.out.print("ù��° ������ �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.println("ù��° ������ " + num1 + "�Դϴ�.");
		
		System.out.print("�ι�° ������ �Է��ϼ���: ");
		int num2 = sc.nextInt();
		System.out.println("�ι�° ������ " + num2 + "�Դϴ�.");
		System.out.println();
		
		if (num1 > num2) {
			System.out.println("ù��° ������ " + num1 + "�� ���� ū �� �Դϴ�.");
		}
		
		if (num1 < num2) {
			System.out.println("�ι�° ������ " + num2 + "�� ���� ū �� �Դϴ�.");
		}
		
		sc.close();
	}

}
