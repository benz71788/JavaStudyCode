package ex10_2.math;

import ex10_5.geometry.Circle;
import ex10_2.geometry.polygon.Rectangle;

public class PackageExample5 {
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rect = new Rectangle(8, 9);
		
		if(circle.getArea() > rect.getArea()) {
			System.out.println("원의 면적이 더 넓습니다.");
		} else {
			System.out.println("원의 면적은 직사각형의 면적보다 작습니다.");
		}
	}

}
