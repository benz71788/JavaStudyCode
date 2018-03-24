package ex6_1_array;

public class ArrayExample3 {
	
	public static void main(String[] args) {
		
		System.out.println("=========规过1=========");
		
		int arr[];
		arr = new int[5];
		
		arr[0] = 10; arr[1] = 20; arr[2] = 30;
		arr[3] = 40; arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Done.");
		
		System.out.println("=========规过2==========");
		
		int arr2[] = new int[5];
		arr2[0] = 10; arr2[1] = 20; arr2[2] = 30;
		arr2[3] = 40; arr2[4] = 50;
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("Done.");
		
		System.out.println("=========规过3==========");
		
		int arr3[] = {10, 20, 30, 40, 50};
//		int arr3[] = new int[]{10, 20, 30, 40, 50};
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("Done.");
		
		System.out.println("=========规过4==========");
		//氢惑等 for巩
		int arr4[] = new int[]{10, 20, 30, 40, 50};
		
		for(int ar : arr4) {
			System.out.println(ar);
		}
		System.out.println("Done.");
	}

}
