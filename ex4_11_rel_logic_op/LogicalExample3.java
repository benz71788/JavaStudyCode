package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample3 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("������ �Է��ϼ���: ");
		int num1 = sc.nextInt();
		
		if(num1 == 1 || num1 == 11) {
			System.out.println("�Է��� ���� 1 �Ǵ� 11�Դϴ�.");
		} else {
			System.out.println("�Է��� ���� 1 �Ǵ� 11�� �ƴմϴ�.");
		}
		
		sc.close();
	}

}
