package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW2_ex08_1 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("두 양수를 입력하세요.");
		int num1 = sc.nextInt(); //3
		int num2 = sc.nextInt(); //1
		
		if(num1 > 0 && num2 > 0) {
			
			if(num1 > num2) {
				int change = num2;
				num2 = num1;
				num1 = change;
			}
			int sum = 0;
			for(int i = num1; i <= num2; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		
		sc.close();
	}

}
