package ex4_10_incre_dec;

public class IncreDecExample3 {
	
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		
		int result1 = num1++;
		int result2 = num2--;
		int result3 = ++num3;
		int result4 = --num4;
		
		System.out.println("num1 = " + num1 + "\t result1 = " + result1);
//					int result1 = num1++;
//		 �ǹ� ==> 	result1 = num1;
//					num1 = num1 + 1;
		
		System.out.println("num2 = " + num2 + "\t result2 = " + result2);
//					int result2 = num2--;
//		 �ǹ� ==>		result2 = num2;
//					num2 = num2 - 1;
		
		System.out.println("num3 = " + num3 + "\t result3 = " + result3);
//					int result3 = ++num3;
//		 �ǹ�==>		num3 = num3 + 1;
//					result3 = num3;
		
		System.out.println("num4 = " + num4 + "\t result4 = " + result4);
//					int result4 = --num4;
//		 �ǹ�==>		num4 = num4 - 1;
//		 			result4 = num4;
		
	}

}
