package ex5_5_for;

public class For04_GUGU2 {
	
	public static void main(String[] args) {
		System.out.println("===구구단===");
		
		for(int i = 2; i < 10; i++) {
			System.out.print("[" + i + "단]" + "\t\t");
		}
		System.out.println();
		
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
		
//		int m = 1;
//		for(int k = 2; k < 10; k++) {
//			System.out.print(k + " * " + m + " = " + (k * m) + "\t");
//		}
	}

}
