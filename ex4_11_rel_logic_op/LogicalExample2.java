package ex4_11_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("������ �Է��ϼ���: ");
		int num1 = sc.nextInt();
		
		if(num1 >= 1 && num1 <= 10) {
			System.out.println("������ 1 ~ 10���̿� �ֽ��ϴ�.");
		} else {
			System.out.println("������ 1 ~ 10���̿� �����ϴ�.");
		}
		
		sc.close();
	}

}
