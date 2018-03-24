package ex6_4_method;

import java.io.InputStream;
import java.util.Scanner;

public class Method_Test05 {
	
	public static void main(String[] args) {
		
		int[] data = new int[5];
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("정수 5개를 입력하세요?");
		for(int i = 0; i < data.length; i++)
		{
			data[i] = sc.nextInt();
		}
		
		System.out.println("최대값 : " + max(data));
		System.out.println("최소값 : " + min(data));
		
		sc.close();
	}
	
	public static int max(int[] data) {
		int max_num = data[0];
		for(int i = 1; i < data.length; i++) {
			if(max_num < data[i]) {
				max_num = data[i];
			}
		}
		
		return max_num;
	}
	
	public static int min(int[] data) {
		int min_num = data[0];
		for(int i = 1; i < data.length;i++) {
			if(min_num > data[i]) {
				min_num = data[i];
			}
		}
		
		return min_num;
	}

}
