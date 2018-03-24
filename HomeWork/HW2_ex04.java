package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW2_ex04 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("원하는 수를 입력 하세요?");
		int num = sc.nextInt();
		
		System.out.printf("***%d의 약수를 출력합니다.***\n", num);
		for(int i = 1; i <= num; i++) {
			if(!(num % i == 0)) {
				continue;
			}
			System.out.println(i);
		}
		
		sc.close();
	}

}
