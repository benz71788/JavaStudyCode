package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW2_ex09 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("ù ��° ���� ����: ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� ����: ");
		int num2 = sc.nextInt();
		
		System.out.print("�� ��° ���� ����: ");
		int num3 = sc.nextInt();
		
		sum = num1 + num2 + num3;
		avg = (double)(num1 + num2 + num3) / (double)3;
		
		System.out.printf("������? %d\n", sum);
		System.out.printf("�����? %.2f\n", avg);
		
		sc.close();
	}

}
