package ex7_3_default_constructor;

public class Circle {
	
	double radius;
	final double PI = 3.14;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea() {
		
		double area;
		
		area = this.radius * this.radius * PI;
		
		return area;
	}

}
