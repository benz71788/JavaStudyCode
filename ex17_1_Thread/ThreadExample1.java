package ex17_1_Thread;

import java.util.Scanner;

/*
 * �̱� �����庸�� ��Ƽ �����带 ����ϸ� �� ȿ������ ���
 * 	1. �����͸� �Է¹޴� �۾�
 * 	2. ��Ʈ��ũ�� ������ �ְ� �޴� �۾�
 * 	3. �����ͷ� ������ ����ϴ� �۾�
 * 	�� �ܺα����� ������� �ʿ�� �ϴ� ����̴�.
 * 
 * 	ThreadExample1.java��
 * 	�ϳ��� ������� ������� �Է��� �޴� �۾��� ȭ�鿡 ���ڸ� ����ϴ�
 * 	�۾��� ó���ϱ� ������ ����ڰ� �Է��� ��ġ�� ��������
 * 	ȭ�鿡 ���ڰ� ��µ��� �ʴٰ� ����ڰ�
 * 	�Է��� ��ġ�� ������ ȭ�鿡 ���ڰ� ��µȴ�.
 */

class ThreadExample1 {
	
	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();
		
		System.out.println("�ƹ��ų� �Է��ϼ���~");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��Ͻ� ������ \'" + sc.nextLine() + "\' �Դϴ�.");
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		sc.close();
	}

}
