package ex0_01_programmers;

public class getMinMax {
	
	public static void main(String[] args) {
		String str = "-200 -500 20 -1400";
		String arr[] = str.split(" ");
		String r;
		int[] num = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		int[] result = new int[] {num[0], num[0]};
		
		
		
		for(int i = 0; i < arr.length; i++) {
			if(result[0] < num[i]) {
				result[0] = num[i];
			}
			if(result[1] > num[i]) {
				result[1] = num[i];
			}

			System.out.println(arr[i]);
			
		}
		
		
		r = Integer.toString(result[0]) + " " + Integer.toString(result[1]);
		System.out.println(r);
	}
	
}
