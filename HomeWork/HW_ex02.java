package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW_ex02 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력하세요?");
		int num = sc.nextInt();
		
		int result = (num - 1) / 10;
		System.out.println("입력값    출력값");
		System.out.printf(" %d      %d", num, result);
		sc.close();
	}

}
