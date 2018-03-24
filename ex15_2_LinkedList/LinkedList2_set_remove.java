package ex15_2_LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

class LinkedList2_set_remove {
	
	public static void main(String[] args) {
		//LinkedList ��ü�� ����
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		printFruit(list);
		
		list.add(2, "Ű��");
		printFruit(list);	
		
		list.set(0, "������");
		printFruit(list);
		
		list.remove(1);
		printFruit(list);
		
		list.remove("Ű��");
		printFruit(list);
		
	}
	
	static void printFruit(LinkedList<String> list) {
		System.out.println("================");
//		iterator()�޼ҵ带 ȣ���Ͽ� Iterator ��ü�� ��´�.
		Iterator<String> iterator = list.iterator();
		
//		Iterator ��ü�� �̿��Ͽ� list�� �ִ� �����͸� ������� �����ͼ� ���
		while(iterator.hasNext()) {	//���� ��ġ���� ���� �����Ͱ� �ִ��� Ȯ��
			String str = iterator.next();	//���� �����͸� �������� �޼ҵ�
			System.out.println(str);
		}
	}

}
