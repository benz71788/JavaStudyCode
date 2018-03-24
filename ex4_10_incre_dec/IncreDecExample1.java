package ex4_10_incre_dec;

public class IncreDecExample1 {
	
	public static void main(String[] args) {
		
		int num = 0;
		
		int a = num++; // num = num + 1;
		System.out.println(num);
		System.out.println(a);
		System.out.println();
		
		int b = ++num; // num = num + 1;
		System.out.println(num);
		System.out.println(b);
		System.out.println();
		
		int c = num--; // num = num - 1;
		System.out.println(num);
		System.out.println(c);
		System.out.println();
		
		int d = --num; // num = num - 1;
		System.out.println(num);
		System.out.println(d);
		System.out.println();
	}

}
