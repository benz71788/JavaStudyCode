package ex5_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("알파벳을 입력하세요?");
//		String ch = sc.next();
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A':
		case 'a':
			System.out.println("사과");
			break;
			
		case 'P':
		case 'p':
			System.out.println("배");
			break;
			
		case 'G':
		case 'g':
			System.out.println("포도");
			break;
			
		default :
			System.out.println("???");
			break;	
		}
		
		sc.close();
	}

}
