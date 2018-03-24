package ex6_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayExample5 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum = 0;
		double avg = 0;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("정수 5개를 입력하세요?");
		for(int j = 0; j < arr.length; j++) {
			 arr[j] = sc.nextInt();
			 sum = sum + arr[j];
		}

		avg = (double)sum / arr.length;
		System.out.printf("합 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		sc.close();
	}

}
