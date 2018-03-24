package ex5_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample4 {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("������ �Է��ϼ���? ");
		int num = sc.nextInt();
		
		if(num >= 90) {
			System.out.println("A�����Դϴ�.");
		} else if(num >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if(num >= 70) {
			System.out.println("C�����Դϴ�.");
		} else if(num >= 60) {
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}
		
		System.out.println("=========================");
		
		int major = num / 10;
		switch(major){
		case 10 : case 9 :
			System.out.println("A�����Դϴ�.");
			break;
		case 8 :
			System.out.println("B�����Դϴ�.");
			break;
		case 7 :
			System.out.println("C�����Դϴ�.");
			break;
		case 6 :
			System.out.println("D�����Դϴ�.");
			break;
		default :
			System.out.println("F�����Դϴ�.");
			break;
		}
		
		sc.close();
	}
}
