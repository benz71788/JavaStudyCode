package ex9_enum_hw;

import ex9_enum_hw.Lendable2.BookState;

public class InterfaceExample2 {
	
	public static void main(String[] args) {
		
		SeparateVolume2 separate = new SeparateVolume2("863ㅂ", "나무", "베르베르");
		
		printState(separate);
	
		try {
			separate.checkOut("SEONGHEE LEE", "20180219");
			separate.checkOut("SEONGHEE LEE", "20180219");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		printState(separate);
		
	}
	
	static void printState(SeparateVolume2 separate) {
		//인터페이스 Lendable을 구현하지 않은 클래스에서의 사용법
		//인터페이스.필드
		if(separate.state == BookState.STATE_NORMAL) {
			System.out.println("========================");
			System.out.println("대출 상태: 대출이 가능합니다.");
			System.out.println("========================");
		} 
		if(separate.state == BookState.STATE_BORROWED) {
			System.out.println("========================");
			System.out.println("대출 상태: 대출중입니다.");
			System.out.println("대출인: " + separate.borrower);
			System.out.println("대출일: " + separate.checkOutDate);
			System.out.println("========================");
		}
	
	}
}
