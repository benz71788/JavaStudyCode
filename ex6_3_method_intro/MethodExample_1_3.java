package ex6_3_method_intro;

public class MethodExample_1_3 {
	
	public static void main(String[] args) {
		
		System.out.println("합(1 ~ 10): " + MethodExample_1_3.printSum(1, 10));
		System.out.println("합(1 ~ 10): " + printSum(1, 100));
		System.out.println("합(1 ~ 10): " + printSum(1, 1000));
	}
	
	public static int printSum(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
//		System.out.println("합(" + start + " ~ " + end + ") : " + sum);
		
		return sum;
	}


}
