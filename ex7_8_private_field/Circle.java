package ex7_8_private_field;

class Circle {
	
	//접근 제어자 private은 클래스 내부에서 사용가능하다. - 정보의 은닉
	private double radius;
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
