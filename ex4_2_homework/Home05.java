package ex4_2_homework;

import java.io.InputStream;
import java.util.Scanner;

public class Home05 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("������ �Է��ϼ���?");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println(num + "�� 3�� ����Դϴ�.");
		} else {
			System.out.println(num + "�� 3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
	}

}
