package ex6_1_array;

public class ArrayExample6 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {20, 30, 40, 80, 10};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i])
				min = arr[i];
			}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	}

}
