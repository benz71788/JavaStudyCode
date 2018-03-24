package HomeWork;

public class HW2_ex05 {
	
	public static void main(String[] args) {
		
		System.out.println("===================================================");
		
		int result = 0;

		for(int num = -4; num <= 28; num = num + 7) {
			for(int i = 1; i <= 7; i++) {
				result = i + num;

				if(result < 1 || result > 28) {
					System.out.print("\t");
				} else {
					System.out.print(result + "\t");
				}
			}
			System.out.println();
		}
		
		
//		for(int i = -3; i <= 28; i++) {
//			if(i <= 0)
//				System.out.printf("%5s", " ");
//			else
//				System.out.printf("%5d", i);
//			if(i % 7 == 3)
//				System.out.println();
//		}
		
			
	}

}
