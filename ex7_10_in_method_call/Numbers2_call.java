package ex7_10_in_method_call;

import java.io.InputStream;
import java.util.Scanner;

public class Numbers2_call {
	
	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("정수 5개 입력하세요:");
		
		for(int i = 0; i < num.length; i++){
			num[i] = sc.nextInt();
		}
		
		Numbers2 nb = new Numbers2(num);
		
		int add = nb.getTotal();
		int average = nb.getAverage();
		
		System.out.println("합 : " + add);
		System.out.println("평균 : " + average);
		
		sc.close();
	}

}
