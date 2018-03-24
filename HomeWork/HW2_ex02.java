package HomeWork;

public class HW2_ex02 {
	
	public static void main(String[] args) {
		int line = 5;
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= line - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
