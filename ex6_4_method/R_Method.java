package ex6_4_method;

public class R_Method {
	
	public static void main(String[] args) {
		
		int[] num = new int[] {10, 20};
		
		System.out.println("Before change");
		System.out.println("num[0] : " + num[0]);
		System.out.println("num[1] : " + num[1]);
		
		change(num);
		
		System.out.println("After change");
		System.out.println("num[0] : " + num[0]);
		System.out.println("num[1] : " + num[1]);
		
	}
	
	public static void change(int[] num) {
		int ch = num[0];
		num[0] = num[1];
		num[1] = ch;
	}

}
