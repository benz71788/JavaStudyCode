package ex8_16_interface_constant;

public class InterfaceExample {
	
	public static void main(String[] args) {
		
		SeparateVolume separate = new SeparateVolume("863ㅂ", "나무", "베르베르");
		
		printState(separate);
		
		separate.checkOut("SEONGHEE LEE", "20180219");
		
		printState(separate);
		
	}
	
	static void printState(SeparateVolume separate) {
		//인터페이스 Lendable을 구현하지 않은 클래스에서의 사용법
		//인터페이스.필드
		if(separate.state == Lendable.STATE_NORMAL) {
			System.out.println("========================");
			System.out.println("대출 상태: 대출이 가능합니다.");
			System.out.println("========================");
		} 
		if(separate.state == Lendable.STATE_BORROWED) {
			System.out.println("========================");
			System.out.println("대출 상태: 대출중입니다.");
			System.out.println("대출인: " + separate.borrower);
			System.out.println("대출일: " + separate.checkOutDate);
			System.out.println("========================");
		}
	
	}
}
