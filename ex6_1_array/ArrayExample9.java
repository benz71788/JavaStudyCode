package ex6_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayExample9 {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		String[] names = new String[] {"ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿"};
		int index = -1;
		
		System.out.println("�˻��� �̸��� �Է��ϼ���? ");
		System.out.print("�̸� : ");
		String name = sc.next();
		
		for(int i = 0; i < names.length; i++) {
			if(name.equals(names[i])) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println(name + "�� �迭��  �濡�� ã���� �����ϴ�.");
		} else {
			System.out.println(name + "�� �迭�� " + index + "�濡�� ã�ҽ��ϴ�.");
		}
		
		sc.close();
	}

}
