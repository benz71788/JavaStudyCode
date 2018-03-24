package ex10_2.math;

import ex10_6.geometry.polygon.*;

public class PackageExample6 {
	
	public static void main(String[] args) {
		Square square = new Square(7);
		Rectangle rect = new Rectangle(5, 10);
		
		if(square.getArea() > rect.getArea()) {
			System.out.println("���簢���� ������ �� �н��ϴ�.");
		} else {
			System.out.println("���簢���� ������ ���簢���� �������� �۰ų� �����ϴ�.");
		}
		
		System.out.println(square.toString());
		System.out.println(rect.toString());
	}

}
