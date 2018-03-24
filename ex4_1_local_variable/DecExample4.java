package ex4_1_local_variable;

public class DecExample4 {
	
	public static void main(String[] args) {
		{
			int num = 10;
		}
		int num = 20;
		System.out.println(num); // 변수 num이 괄호안에 정의된 지역변수이기 때문에 에러 발생

	}
}
