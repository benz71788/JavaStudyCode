package ex9_2_null;

public class RefTypeExample3 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Point point = null;
		
		// Point point = new Point(3, 4);
		
		if(point == null) {
			System.out.println("point 변수가 가리키는 객체는 없습니다.");
			return;
		} else {
			System.out.println("x = " + point.x);
			System.out.println("y = " + point.y);
		}
		
	}

}
