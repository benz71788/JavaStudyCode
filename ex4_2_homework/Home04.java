package ex4_2_homework;

import java.io.InputStream;
import java.util.Scanner;

public class Home04 {
	
	public static void main(String[] args) {
		
		int add, sub, mult, div;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("ù��° ������ �Է��ϼ���? ");
		int a = sc.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ���? ");
		int b = sc.nextInt();
		
		System.out.println("�� ������ " + a + ", " + b + "�Դϴ�.");
		
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
