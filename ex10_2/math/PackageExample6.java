package ex10_2.math;

import ex10_6.geometry.polygon.*;

public class PackageExample6 {
	
	public static void main(String[] args) {
		Square square = new Square(7);
		Rectangle rect = new Rectangle(5, 10);
		
		if(square.getArea() > rect.getArea()) {
			System.out.println("정사각형의 면적이 더 넓습니다.");
		} else {
			System.out.println("정사각형의 면적은 직사각형의 면적보다 작거나 같습니다.");
		}
		
		System.out.println(square.toString());
		System.out.println(rect.toString());
	}

}
