package array;

public class Harshad {
	
	public static void main(String[] args) {
		int sum = 0;
		int num = 18;
		String str = Integer.toString(num);
		String[] arr = str.split("");
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.valueOf(arr[i]);
		}
		
		System.out.println(sum);
		
		if(num % sum == 0) {
			System.out.println(num);
		}
	}

}
