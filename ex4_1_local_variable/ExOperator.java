package ex4_1_local_variable;

public class ExOperator {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 5;
		int add, sub;
		int multi;
		double div;
		int rem;
		
		add = a + b;
		sub = a - b;
		multi = a * b;
		div = (double)a / (double)b;
		rem = a % b;
		
		System.out.printf("%d + %d = %d\n", a, b, add);
		System.out.printf("%d - %d = %d\n", a, b, sub);
		System.out.printf("%d * %d = %d\n", a, b, multi);
		System.out.printf("%d / %d = %.1f\n", a, b, div);
		System.out.printf("%d %% %d = %d\n", a, b, rem);
		System.out.println();
		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + multi);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " % " + b + " = " + rem);
		
	}

}
