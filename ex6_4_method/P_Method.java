package ex6_4_method;

public class P_Method {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Befor : num1 = " + num1 + ", num2 = " + num2);
		
		P_Method.change(num1, num2);
		
		System.out.println("After : num1 = " + num1 + ", num2 = " + num2);

	}

	
	public static void change(int num1, int num2) {
		
		int ch = 0;
		ch = num1;
		num1 = num2;
		num2 = ch;
		
		
		
	}

}
