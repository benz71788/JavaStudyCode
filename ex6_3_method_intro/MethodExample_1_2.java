package ex6_3_method_intro;

public class MethodExample_1_2 {
	
	public static void main(String[] args) {
		
		MethodExample_1_2.printSum(1, 10);
		printSum(1, 100);
		printSum(1, 1000);
	}
	
	public static void printSum(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("гу(" + start + " ~ " + end + ") : " + sum);
		
		return;
	}

}
