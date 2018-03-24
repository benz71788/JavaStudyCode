package ex5_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample4 {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("학점을 입력하세요? ");
		int num = sc.nextInt();
		
		if(num >= 90) {
			System.out.println("A학점입니다.");
		} else if(num >= 80) {
			System.out.println("B학점입니다.");
		} else if(num >= 70) {
			System.out.println("C학점입니다.");
		} else if(num >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		
		System.out.println("=========================");
		
		int major = num / 10;
		switch(major){
		case 10 : case 9 :
			System.out.println("A학점입니다.");
			break;
		case 8 :
			System.out.println("B학점입니다.");
			break;
		case 7 :
			System.out.println("C학점입니다.");
			break;
		case 6 :
			System.out.println("D학점입니다.");
			break;
		default :
			System.out.println("F학점입니다.");
			break;
		}
		
		sc.close();
	}
}
