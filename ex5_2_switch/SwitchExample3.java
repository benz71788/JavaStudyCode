package ex5_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample3 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���ĺ� 3���� �Է��ϼ��� : ");
		String imsi = sc.next();
		System.out.println("ù��° ���� " + imsi.charAt(0));
		System.out.println("�ι�° ���� " + imsi.charAt(1));
		System.out.println("����° ���� " + imsi.charAt(2));
		
		System.out.println("\n=====================\n");
		
		System.out.printf("ù��° ���� %c\n", imsi.charAt(0));
		System.out.printf("�ι�° ���� %c\n", imsi.charAt(1));
		System.out.printf("����° ���� %c\n", imsi.charAt(2));
		
		sc.close();
	}

}