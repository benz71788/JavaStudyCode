package ex5_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample3 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("알파벳 3글자 입력하세요 : ");
		String imsi = sc.next();
		System.out.println("첫번째 문자 " + imsi.charAt(0));
		System.out.println("두번째 문자 " + imsi.charAt(1));
		System.out.println("세번째 문자 " + imsi.charAt(2));
		
		System.out.println("\n=====================\n");
		
		System.out.printf("첫번째 문자 %c\n", imsi.charAt(0));
		System.out.printf("두번째 문자 %c\n", imsi.charAt(1));
		System.out.printf("세번째 문자 %c\n", imsi.charAt(2));
		
		sc.close();
	}

}
