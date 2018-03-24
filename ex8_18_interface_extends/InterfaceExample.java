package ex8_18_interface_extends;

public class InterfaceExample {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(100, 200, 10, 10);
		
		printState(rectangle);
		
		rectangle.moveTo(55, 75);
		printState(rectangle);
		
		rectangle.moveBy(-5, -5);
		printState(rectangle);
		
		rectangle.resize(30, 30);
		printState(rectangle);
	}
	
	static void printState(Rectangle rectangle) {
		System.out.printf("사각형: 위치(%3d, %3d) 크기(%d, %d)\n", rectangle.x, rectangle.y, 
				rectangle.width, rectangle.height);
	}

}
