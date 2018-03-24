package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW2_ex09 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("첫 번째 과목 점수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 과목 점수: ");
		int num2 = sc.nextInt();
		
		System.out.print("세 번째 과목 점수: ");
		int num3 = sc.nextInt();
		
		sum = num1 + num2 + num3;
		avg = (double)(num1 + num2 + num3) / (double)3;
		
		System.out.printf("총점은? %d\n", sum);
		System.out.printf("평균은? %.2f\n", avg);
		
		sc.close();
	}

}
