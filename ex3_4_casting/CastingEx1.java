package ex3_4_casting;

public class CastingEx1 {
	
	public static void main(String[] args) {
		
		// int -> double(암시적, 묵시적)
		int i1 = 10;
		
		double d1 = i1; //실수형 변수에 정수형 값을 저장할 수 있다.(자동으로 형변환이 된다.)
		
		System.out.println("d1 데이터는 " + d1 + "입니다.");
		
		System.out.println();
		
		
		// double -> int(명시적, 강제적)
		double d2 = 10.1234;
		
		int i2 = (int)d2; //형변환을 위해서는 실수형 변수에 정수형 데이터 타입을 입력해준다.
		
		System.out.println("i2 데이터는 " + i2 + "입니다.");
		
		System.out.println();
		
		// int -> char
		int i3 = 97;
		char c1 = (char)i3;
		System.out.println("i3데이터는 " + i3 + "입니다.");
		System.out.println("c1데이터는 " + c1 + "입니다.");
		System.out.println();
		
		i3 = 65;
		c1 = (char)i3;
		System.out.println("i3데이터는 " + i3 + "입니다.");
		System.out.println("c1데이터는 " + c1 + "입니다.");
		System.out.println();
		
		System.out.printf("%c\n", 'A');
		System.out.printf("유니코드 65는 문자 %c를 의미합니다.\n", 65);
		System.out.printf("문자 A의 유니코드는 %d입니다. \n", (int)'A');
	}

}
