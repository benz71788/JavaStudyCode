package ex5_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample3_2 {
	
	public static void main(String[] args) {
		int max, min;
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("�� ���� �Է��ϼ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 + "�� ù��° �Է°��� ���� Ů�ϴ�.");
			}
		} else if(num2 > num3) {
			if(num2 > num1) {
				System.out.println(num2 + "�� �ι�° �Է°��� ���� Ů�ϴ�.");
			}
		} else if(num3 > num1) {
			if(num3 > num2) {
				System.out.println(num3 + "�� ����° �Է°��� ���� Ů�ϴ�.");
			}
		}
		
		if(num1 < num2) {
			if(num1 < num3) {
				System.out.println(num1 + "�� ù��° �Է°��� ���� �۽��ϴ�.");
			}
		} else if(num2 < num3) {
			if(num2 < num1) {
				System.out.println(num2 + "�� �ι�° �Է°��� ���� �۽��ϴ�.");
			}
		} else if(num3 < num1) {
			if(num3 < num2) {
				System.out.println(num3 + "�� ����° �Է°��� ���� �۽��ϴ�.");
			}
		}
		
		System.out.println("\n===================================\n");
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
			System.out.println(num1 + "�� ù��° �Է°��� ���� Ů�ϴ�.");
		} else if(num2 > num1 && num2 > num3) {
			max = num2;
			System.out.println(num2 + "�� �ι�° �Է°��� ���� Ů�ϴ�.");
		} else {
			max = num3;
			System.out.println(num3 + "�� ����° �Է°��� ���� Ů�ϴ�.");
		}
		
		if(num1 < num2 && num1 < num3) {
			min = num1;
			System.out.println(num1 + "�� ù��° �Է°��� ���� �۽��ϴ�.");
		} else if(num2 < num1 && num2 < num3) {
			min = num2;
			System.out.println(num2 + "�� �ι�° �Է°��� ���� �۽��ϴ�.");
		} else {
			min = num3;
			System.out.println(num3 + "�� ����° �Է°��� ���� �۽��ϴ�.");
		}
		
		System.out.println("\n===================================\n");
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		sc.close();
	}

}
