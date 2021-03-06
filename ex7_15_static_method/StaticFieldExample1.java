package ex7_15_static_method;

public class StaticFieldExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("정적변수 grandTotal = " + Accumulator.grandTotal);
		
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		System.out.println("obj1 total = " + obj1.total);
//		System.out.println("obj1 grandTotal = " + obj1.grandTotal);
		
		System.out.println("obj2 total = " + obj2.total);
//		System.out.println("obj2 grandTotal = " + obj2.grandTotal);
		
		//정적변수 사용법 : 클래스명.정적변수
		// 정적 메서드 호출문
		int grandTotal = Accumulator.grandTotal;
		System.out.println("총계 = " + grandTotal);
	}

}
