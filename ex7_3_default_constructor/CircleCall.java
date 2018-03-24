package ex7_3_default_constructor;

import java.io.InputStream;
import java.util.Scanner;

public class CircleCall {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("반지름을 입력하세요: ");
		double num = sc.nextDouble();
		
		Circle cc = new Circle(num);
		
		printCircleInfo(cc);
		
		sc.close();
		
	}
	
	static void printCircleInfo(Circle obj) {
		double area = obj.getArea();
		
		System.out.println("원의 반지름: " + obj.radius);
		System.out.println("원의 넓이: " + area);
	}

}
