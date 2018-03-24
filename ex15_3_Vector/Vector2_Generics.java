package ex15_3_Vector;

import java.util.Vector;

class Vector2_Generics {
	
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		
		String temp;
		for(int i = 0; i < vec.size(); i++) {
			temp = vec.get(i);
			/*
			 * get(i)�� ��ȯ���� Object�������� Generic���� �����߱� ������
			 * (String)�� ������ �� �ִ�.
			 * temp = (String)vec.get(i);
			 * Generic�� ������� ���� ��쿡�� ��ȯ���� ��������� �����ؾ� �Ѵ�.
			 */
			
			System.out.println(temp.toUpperCase());
			System.out.println(temp.toLowerCase());
			System.out.println("=========");
		}
	}

}
