package ex15_1_ArrayList;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//������ ���� �� ���� ������� �Է��غ�����
		//1�� �Է��ϰ� ����
		//21 ���� �ڹ��� ���� ����
		System.out.println("���̸� �Է��ϼ���>");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���>");
		String name = sc.nextLine();
		
		System.out.println("���̴� = " + age);
		if(name.equals("")) {
			System.out.println("�̸��� = ���ڿ��Դϴ�.");
		} else {
			System.out.println("�̸��� = " + name);
			System.out.println("name�� ���� = " + name.length());
		}
		
		sc.close();
	}

}
