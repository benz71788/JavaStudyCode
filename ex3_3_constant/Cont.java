package ex3_3_constant;

public class Cont {
	
	public static void main(String[] args) {
		
		// 상수 : 값을 한 번만 저장할 수 있는 공간
		// 상수 만드는 법 : 변수 타입 앞에 키워드 final만 붙여 주기만 하면 된다.
		// 일반적으로 상수의 이름은 대문자로 한다.
		final double PI = 3.141592;
		System.out.println(PI);
		// PI=3.14; // 값을 변경하는 문장을 사용하면 에러가 발생한다.(final을 제거하면 가능함)
	}

}
