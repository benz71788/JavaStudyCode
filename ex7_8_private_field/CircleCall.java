package ex7_8_private_field;

public class CircleCall {
	
	public static void main(String[] args) {
		
		Circle cc = new Circle(0.0);
		
//		cc.radius = 5.0; // radius가 private이기 때문에 접근이 제한되어 에러 발생
		
		double area = cc.getArea();
		
//		System.out.println("원의 반지름: " + cc.radius);
		System.out.println("원의 넓이: " + area);
	
	}
	
}
