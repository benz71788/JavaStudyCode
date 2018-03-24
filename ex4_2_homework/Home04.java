package ex4_2_homework;

import java.io.InputStream;
import java.util.Scanner;

public class Home04 {
	
	public static void main(String[] args) {
		
		int add, sub, mult, div;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("첫번째 정수를 입력하세요? ");
		int a = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요? ");
		int b = sc.nextInt();
		
		System.out.println("두 정수는 " + a + ", " + b + "입니다.");
		
		add = a + b;
		sub = a - b;
		mult = a * b;
		div = a / b;
		
		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mult);
		System.out.println(a + " / " + b + " = " + div);
		
		sc.close();
		
	}

}
