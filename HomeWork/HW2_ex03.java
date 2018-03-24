package HomeWork;

public class HW2_ex03 {
	
	public static void main(String[] args) {
		
		int line = 5;
		for(int i = 1; i <= line; i = i + 1) {
			
			for(int m = 1; m <= line - i + 1; m = m + 1) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i * 2 - 1; j = j + 1) {
				System.out.print("*");
			}
 
			System.out.println();
		}
	}

}
