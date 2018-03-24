package ex6_3_method_intro;

public class MethodExample1 {
	
	public static void main(String[] args) {
		
		// 메서드 호출 방법1 - 클래스명.정적메서드
		MethodExample1.printCharacter('*', 30); // 메서드 호출
		
		// 메서드 호출 방법2.
		printCharacter('-', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);
		printCharacter('*', 30);
		
	}
	
	// 메서드 정의
	public static void printCharacter(char ch, int num) {
		
		for(int i = 0; i < num; i++) {
			System.out.print(ch);
		}
		System.out.println();
		return; // 반환형이 void인 경우 생략가능하다.
	}

}
