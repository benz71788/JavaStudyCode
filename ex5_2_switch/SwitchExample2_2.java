package ex5_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample2_2 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���ĺ��� �Ѱ��� �Է��ϼ���?");
		String imsi = sc.next();
		
		switch(imsi){
			case "A" :
			case "a" :
				System.out.println("���");
				break;
			
			case "P" :
			case "p" :
				System.out.println("��");
				break;
				
			case "G" :
			case "g" :
				System.out.println("����");
				break;
			
			default :
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				break;
		}
		
		sc.close();
	}

}
