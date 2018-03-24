package ex4_08_concate_op;

public class ConcatExample1 {
	
	public static void main(String[] args) {
		String str1 = "num = " + 3 + 4;
		String str2 = 3 + 4 + " = num";
		String str3 = "num = " + (3 + 4);
		System.out.println(str1); // num = 34
		System.out.println(str2); // 7 = num
		System.out.println(str3); // num = 7
	}

}
