package ex14_1_Wrapper;

public class Wrapper2_1_String_to_int {
	
	public static void main(String[] args) {
		
		/* 
		 * Integer객체를 이용한 String -> int 방법 두 가지
		 * 
		 * 방법1.
		 * 	String -> Integer 객체
		 * 	Integer 객체 -> int형 값
		 */
		
		int total = 0;
		for(int cnt = 0; cnt < args.length; cnt++) {
			//에러발생(Stirng -> int 형변환 요구)
			Integer obj = new Integer(args[cnt]);
			total = obj.intValue() + total;
		}
		System.out.println(total);
		
		
		/*
		 * 방법2.
		 * 	String -> int
		 * 	예)Integer.parseInt(args[cnt]);
		*/
		int total2 = 0;
		for(int cnt = 0; cnt < args.length; cnt++) {
			int arg = Integer.parseInt(args[cnt]);
			total2 = arg + total2;
		}
		System.out.println(total2);
	}

}
