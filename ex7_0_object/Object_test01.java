package ex7_0_object;

import java.io.InputStream;
import java.util.Scanner;

public class Object_test01 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���밪 ���ϴ� ���α׷��Դϴ�.");
		System.out.println("������ �ϳ� �Է��ϼ���?");
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
