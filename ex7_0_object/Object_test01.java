package ex7_0_object;

import java.io.InputStream;
import java.util.Scanner;

public class Object_test01 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("절대값 구하는 프로그램입니다.");
		System.out.println("정수를 하나 입력하세요?");
		int num = sc.nextInt();
		
		System.out.println(abs(num));
		
		sc.close();
		
	}
	
	public static int abs(int num) {
		int absolute = num;
		
		if(num < 0) {
			absolute = num * (-1);
		}
		
		return absolute;
	}

}
