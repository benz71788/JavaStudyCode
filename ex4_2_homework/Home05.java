package ex4_2_homework;

import java.io.InputStream;
import java.util.Scanner;

public class Home05 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력하세요?");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println(num + "은 3의 배수입니다.");
		} else {
			System.out.println(num + "은 3의 배수가 아닙니다.");
		}
		
		sc.close();
	}

}
