package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW_ex05 {
	
public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("page를 입력하세요: ");
		int page = sc.nextInt();
		
		int startPage = ((page - 1) / 10) * 10 + 1;
		System.out.printf("startPage = %d", startPage);
		sc.close();
	}

}
