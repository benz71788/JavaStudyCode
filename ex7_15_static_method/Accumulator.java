package ex7_15_static_method;
//정적필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal 필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드이다.

class Accumulator {
	
	int total = 0;
	static int grandTotal = 0;		// 정적 필드를 선언하는 선언문
	
	void accumulate(int amount) {
		total += amount;
		
		// 정적필드에 amount 파라미터 값을 더하는 대입문
		grandTotal += amount;
	}
	
	static int getGrandTotal() {	// 정적 메서드 선언
//		total = 5;					// 에러 발생
		return grandTotal;
	}

}
