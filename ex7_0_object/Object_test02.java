package ex7_0_object;

import java.io.InputStream;
import java.util.Scanner;

public class Object_test02 {

	public static void main(String[] args) {
	
		int[] num = new int[5];
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("정수 5개를 입력하세요?");
		for(int j = 0; j < num.length; j++) {
			num[j] = sc.nextInt();
		}
		
		int[] result = maxmin(num);
		
		System.out.println("최대값 = " + result[0]);
		System.out.println("최소값 = " + result[1]);
		
		sc.close();
	}
	
	public static int[] maxmin(int[] num) {
		
		int[] result = new int[] {num[0], num[0]};
		
		for(int i = 0; i < num.length; i++) {
			if(result[0] < num[i]) {
				result[0] = num[i];
			}
			
			if(result[1] > num[i]) {
				result[1] = num[i];
			}
		}
		
		return result;
		
	}
	
/*	public static void maxmin(int[] num) {
		
		int max_num = num[0]; 
		int min_num = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if(max_num < num[i]) {
				max_num = num[i];
			}
			
			if(min_num > num[i]) {
				min_num = num[i];
			}
		}

		
		System.out.println("최대값 = " + max_num);
		System.out.println("최소값 = " + min_num);
		
	}
*/
}
