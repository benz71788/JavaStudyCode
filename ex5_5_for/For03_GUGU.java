package ex5_5_for;

import java.io.InputStream;
import java.util.Scanner;

public class For03_GUGU {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("���ϴ� ���� �Է��ϼ���: ");
		int multi = sc.nextInt();
		System.out.println("[" + multi + "��]");
		
		int result;
		
		for(int i = 1; i < 10; i++) {
			
			result = multi * i;
			System.out.printf("%d * %d = %d\n", multi, i, result);
		}
		
		sc.close();
	}

}
