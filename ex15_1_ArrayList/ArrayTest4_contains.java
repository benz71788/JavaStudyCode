package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest4_contains {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("��");
		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("��1");
		list2.add("����");
		list2.add("�ܿ�");
		
		list2.addAll(list1);
		
		System.out.println(list1);
		System.out.println(list2);
		
		if(list1.contains("��")) {
			System.out.println("���� �����մϴ�.");
		} else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
	}

}
