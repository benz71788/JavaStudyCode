package ex10_2.math;

import ex10_5.geometry.Circle;
import ex10_2.geometry.polygon.Rectangle;

public class PackageExample5 {
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rect = new Rectangle(8, 9);
		
		if(circle.getArea() > rect.getArea()) {
			System.out.println("���� ������ �� �н��ϴ�.");
		} else {
			System.out.println("���� ������ ���簢���� �������� �۽��ϴ�.");
		}
	}

}
