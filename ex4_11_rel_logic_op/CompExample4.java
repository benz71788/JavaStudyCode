package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class CompExample4 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		// Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("ù ��° ������ " + num1 + ", �� ��° ������ " + num2 + "�� �Է��Ͽ����ϴ�.");
		
		if(num1 != num2) {
			System.out.println("�ٸ� ���� �Է��Ͽ����ϴ�.");
		} else {
			System.out.println("���� ���� �Է��Ͽ����ϴ�.");
		}
		
		sc.close();
		
	}

}
