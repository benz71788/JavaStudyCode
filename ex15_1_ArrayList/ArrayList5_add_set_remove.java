package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList5_add_set_remove {
	
	public static void main(String[] args) {
		// ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();
		
		// list�� 3���� �����͸� �߰�
		list.add("����");
		list.add("����");
		list.add("������");
		
		// list�� 2���� �����͸� ����
		list.add(2, "Ű��");	// �ε��� 2 ��ġ�� ����
		list.add(4, "Ű��");	// �ε��� 4 ��ġ�� ����
		pArrayList(list);
		
		// �ε��� 0 ��ġ�� �����͸� "������"�� �ٲ۴�.
		list.set(0, "������");
		pArrayList(list);
		
		// �ε��� 1 ��ġ�� �����͸� �����Ѵ�.
		list.remove(1);
		pArrayList(list);
		
		// list���� "Ű��"��� �����͸� ã�Ƽ� �����Ѵ�.
		list.remove("Ű��");
		pArrayList(list);
		
	}
	
	static void pArrayList(ArrayList<String> list) {
		System.out.println("==============================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println("index = " + i + "\t ������ = " + list.get(i));
		}
	}

}
