package ex7_3_default_constructor;

import java.io.InputStream;
import java.util.Scanner;

public class CircleCall {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("�������� �Է��ϼ���: ");
		double num = sc.nextDouble();
		
		Circle cc = new Circle(num);
		
		printCircleInfo(cc);
		
		sc.close();
		
	}
	
	static void printCircleInfo(Circle obj) {
		double area = obj.getArea();
		
		System.out.println("���� ������: " + obj.radius);
		System.out.println("���� ����: " + area);
	}

}
