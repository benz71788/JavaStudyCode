package ex4_1_local_variable;

public class Oper04 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.println("a/b = " + a/b);
		System.out.println("(double)(a/b) = " + (double)(a/b));
		System.out.println("(double)a = " + (double)a);
		System.out.println("(double)a/b = " + (double)a/b);
		System.out.println("a/(double)b = " + a/(double)b);
		System.out.println("(double)a/(double)b = " + (double)a/(double)b);
		
		double d;
		d = (double)a/b;
		System.out.println(a + " / " + b + " = " + d);
		
	}

}
