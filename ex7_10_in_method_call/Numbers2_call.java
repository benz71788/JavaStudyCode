package ex7_10_in_method_call;

import java.io.InputStream;
import java.util.Scanner;

public class Numbers2_call {
	
	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���� 5�� �Է��ϼ���:");
		
		for(int i = 0; i < num.length; i++){
			num[i] = sc.nextInt();
		}
		
		Numbers2 nb = new Numbers2(num);
		
		int add = nb.getTotal();
		int average = nb.getAverage();
		
		System.out.println("�� : " + add);
		System.out.println("��� : " + average);
		
		sc.close();
	}

}
