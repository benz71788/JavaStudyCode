package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW_ex06 {
	
	public static void main(String[] args) {
		
		int maxpage;
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("limit를 입력하세요: ");
		int limit = sc.nextInt();
		System.out.print("listcount를 입력하세요: ");
		int listcount = sc.nextInt();
		
		maxpage = ((limit - 1) / listcount) + 1;
		System.out.println("maxpage = " + maxpage);
		sc.close();
	
	}

}
