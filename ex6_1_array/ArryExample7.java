package ex6_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArryExample7 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("정수 5개를 입력하세요?");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int j = 1; j < arr.length; j++) {
			if(max < arr[j]) {
				max = arr[j];
			}
			if(min > arr[j]) {
				min = arr[j];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		sc.close();
		
	}

}
