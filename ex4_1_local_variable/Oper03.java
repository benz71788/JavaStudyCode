package ex4_1_local_variable;

import java.io.InputStream;
import java.util.Scanner;

public class Oper03 {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("������ �Է��ϼ���?");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + "�� ¦���Դϴ�.");
		} else {
			System.out.println(n + "�� Ȧ���Դϴ�.");
		}
		
		sc.close();
	}

}
