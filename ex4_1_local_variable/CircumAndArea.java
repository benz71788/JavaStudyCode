package ex4_1_local_variable;

public class CircumAndArea {
	
	public static void main(String[] args) {
		final double PI = 3.14; //원주율
		double radius = 3.0; //반지름
		double circum, area;
		
		
		circum = 2 * radius * PI; //원의 둘레
		area = radius * radius * PI; //원의 넓이
		
		System.out.println("원주율 : " + PI);			//원주율
		System.out.println("원의 둘레 : " + circum);	//원의 둘레
		System.out.println("원의 넓이 : " + area);	//원의 넓이
	}

}
