package HomeWork;

import java.io.InputStream;
import java.util.Scanner;

public class HW2_ex04 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���ϴ� ���� �Է� �ϼ���?");
		int num = sc.nextInt();
		
		System.out.printf("***%d�� ����� ����մϴ�.***\n", num);
		for(int i = 1; i <= num; i++) {
			if(!(num % i == 0)) {
				continue;
			}
			System.out.println(i);
		}
		
		sc.close();
	}

}
