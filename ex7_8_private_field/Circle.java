package ex7_8_private_field;

class Circle {
	
	//���� ������ private�� Ŭ���� ���ο��� ��밡���ϴ�. - ������ ����
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
