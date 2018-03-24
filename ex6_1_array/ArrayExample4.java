package ex6_1_array;

public class ArrayExample4 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {95, 70, 80, 75, 100};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("score[" + i + "] = " + arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("รัมก: " + sum);
	}

}
