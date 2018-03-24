package ex4_12_conditional_op;

public class ConditionalOpExample1 {
	
	public static void main(String[] args) {
		int a = 20, b = 30, max, min;
		
		max = a > b ? a : b;
		System.out.println("최대값 = " + max);
		
		min = a > b ? b : a;
		System.out.println("최소값 = " + min);
		
	}

}
