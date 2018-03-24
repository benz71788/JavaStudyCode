package ex5_3_while;

import java.io.InputStream;
import java.util.Scanner;

public class DoWhileExample2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("지역을 입력하세요(프로그램을 종료하시려면 q를 입력하세요): ");
		
		do {
			String local = sc.next();
			
			if(local.equals("q")) {
				System.out.println("끝");
				break;
			}
			System.out.println(local + "입니다.");
		} while(true);
		
		
//		String local;
//		
//		do {
//			local = sc.next();
//			System.out.println(local + "입니다.");
//		} while(!local.equals("q"));
//		System.out.println("끝");
		
		
//		do {
//			String local = sc.next();
//			if(local.equals("q")) {
//				System.out.println("끝");
//				break;
//			} else {
//				System.out.println(local + "입니다.");
//			} 
//		} while(true);
		
		sc.close();
	}

}
