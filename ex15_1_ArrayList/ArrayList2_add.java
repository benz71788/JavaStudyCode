package ex15_1_ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * List �������̽� - ArrayList(��ӹ޴� Ŭ����)
 * 	1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
 * 		ex) int, double, char, boolean, String etc
 * 	2. �Է��� ������� ��µȴ�.(index��ȣ ������ �����)
 * 	3. �ߺ��� Data�� ���� �� �� �ִ�
 * 	4. �迭�� ������ �迭���� ����� �� ���� ���� ����� �� �ִ�.
 * 	5. ������ ���� ������ �̿��� �� �ִ�.
 */
class ArrayList2_add {
	
	public static void main(String[] args) {
		//��ĳ����(������� �޼ҵ常 ��밡���ϴ�.)
		List list = new ArrayList();
		
		//ArrayList list = new ArrayList();
		
		//�ڷ� �߰�
		list.add("�ϳ�");
		list.add(3);
		list.add("Hello");
		list.add(3.14);
		list.add(true);
		list.add("Nice to meet you");
		list.add('A');
		
		//��� ��� 1. - �ش� ��ü������ ����ϴ� ���
		System.out.println("===��ü������ ����ϱ�===");
		System.out.println(list);
		
		//��� ��� 2. - get()�޼ҵ� �̿��
		System.out.println("===get()�޼ҵ� �̿��===");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "��° ��� = " + list.get(i));
		}
		
		//��� ��� 3. - Interator �������̽� ��� : �ݺ���
		System.out.println("===Interator �������̽� ��� ===");
		Iterator elements = list.iterator();
		while(elements.hasNext()) {		//hasNext() : �о�� ��Ұ� �ִ��� Ȯ��
			System.out.println(elements.next());
		}
		// next()�޼ҵ带 �̿��ؼ� ���ʴ�� �Ѱ��� ������ �����´�.
		
		//��� ��� 4. - for�� ���
		System.out.println("=====���� for��=====");
		for(Object a : list) {
			System.out.println(a.toString());
		}
	}
}
