package ex5_3_while;

import java.io.InputStream;
import java.util.Scanner;

public class DoWhileExample2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("������ �Է��ϼ���(���α׷��� �����Ͻ÷��� q�� �Է��ϼ���): ");
		
		do {
			String local = sc.next();
			
			if(local.equals("q")) {
				System.out.println("��");
				break;
			}
			System.out.println(local + "�Դϴ�.");
		} while(true);
		
		
//		String local;
//		
//		do {
//			local = sc.next();
//			System.out.println(local + "�Դϴ�.");
//		} while(!local.equals("q"));
//		System.out.println("��");
		
		
//		do {
//			String local = sc.next();
//			if(local.equals("q")) {
//				System.out.println("��");
//				break;
//			} else {
//				System.out.println(local + "�Դϴ�.");
//			} 
//		} while(true);
		
		sc.close();
	}

}
