package ex4_2_homework;

public class Home03 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		int add, sub, multi;
		double div;
		
		add = a + b;
		sub = a - b;
		multi = a * b;
		div = (double)a / (double)b;
		
		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + multi);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println();
		System.out.printf("%d + %d = %d\n", a, b, add);
		System.out.printf("%d - %d = %d\n", a, b, sub);
		System.out.printf("%d * %d = %d\n", a, b, multi);
		System.out.printf("%d / %d = %.1f\n", a, b, div);
	}

}
