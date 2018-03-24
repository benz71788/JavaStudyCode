package ex10_9.main;

import ex10_9.geometry.shape.Square;

public class AccessControlExample {
	
	public static void main(String[] args) {
		
		Square square = new Square(100, 200, 15);
		
		printSquareInfo(square);
		
	}
	
	static void printSquareInfo(Square square) {
		for(int i = 0; i < square.x.length; i++) {
			System.out.printf("x[%d] = %d, y[%d] = %d\n", i, square.getX(i), i, square.getY(i));
		}
		
		for(int j = 0; j < square.x.length; j++) {
			System.out.printf("(%d, %d)\n", square.getX(j), square.getY(j));
		}
		
	}

}
