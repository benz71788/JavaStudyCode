package ex15_1_ArrayList;

import java.util.List;
import java.util.ArrayList;

/*
 * List �������̽� - ArrayList(��ӹ޴� Ŭ����)
 * 	1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
 * 		ex) int, double, char, boolean, String etc
 * 	2. �Է��� ������� ��µȴ�.(index��ȣ ������ �����)
 * 	3. �ߺ��� Data�� ���� �� �� �ִ�
 * 	4. �迭�� ������ �迭���� ����� �� ���� ���� ����� �� �ִ�.
 * 	5. ������ ���� ������ �̿��� �� �ִ�.
 */
class ArrayList1_add {
	
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
		
		System.out.println(list);	//list�� ��� ������ ���
		System.out.println(list.toString());

		//size() : �������� ���� ���ϴ� �޼ҵ�
		System.out.println("������ : " + list.size());
		
		//get(index) : �ش� �ε����� ������ �������� �޼ҵ�
		//get(3) : 0���� ����, index=3�� ������ ����ض�.
		System.out.println("list.get(3): " + list.get(3));
	}

}
