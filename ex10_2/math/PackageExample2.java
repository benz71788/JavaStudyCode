package ex10_2.math;

import ex10_2.geometry.polygon.Rectangle;
import ex10_5.geometry.Circle;

public class PackageExample2 {
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(2, 3);
		System.out.println("���� = " + rect.width);
		System.out.println("���� = " + rect.height);
		System.out.println("���� = " + rect.getArea());
		
		System.out.println("===================");
		
		Circle circle = new Circle(5);
		System.out.println("���� ���� = " + circle.getArea());
	}

}
