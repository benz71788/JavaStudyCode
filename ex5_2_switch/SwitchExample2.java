package ex5_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���ĺ��� �Է��ϼ���?");
//		String ch = sc.next();
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A':
		case 'a':
			System.out.println("���");
			break;
			
		case 'P':
		case 'p':
			System.out.println("��");
			break;
			
		case 'G':
		case 'g':
			System.out.println("����");
			break;
			
		default :
			System.out.println("???");
			break;	
		}
		
		sc.close();
	}

}
