package ex15_6_HashMap_TreeMap;

import java.util.Map;
import java.util.TreeMap;

/*
 * TreeMap
 * 	���� �˻� Ʈ���� ���·� Ű�� ���� ������ �̷���� �����͸� Ű�� �����ؼ� �����Ѵ�.
 * 	�˻��� ���Ŀ� ������ �÷��� Ŭ�����̴�.
 */
//���׸��� ���
class TreeMap_Generics {
	public static void main(String[] args) {
		
		Map<String, Object> hm = new TreeMap<String, Object>(); // ���2. ���� Ŭ������ ���� ��ü ����
		
		// Key�� Value ���� ����
		// Map�� �޼ҵ�� put�� �̿��� (Key, Value) ������ �ڷ� �����Ѵ�.
		hm.put("woman", "����ִ�");
		hm.put("man", "�����Ϸ�");
		hm.put("grade", new String("10"));
		hm.put("age", new Integer(10));// hm.put("age", 10)
		hm.put("city", "seoul");
		
		// ��� ���1. �ش� ��ü������ ���
		System.out.println(hm);
		//{woman=����ִ�, city=seoul, man=�����Ϸ�, age=10}
		
		// ��� ���2. Key ���� ���
		System.out.println(hm.keySet());
		//[woman, city, man, age]
		
		// ��� ���3. Value ���� ���
		System.out.println(hm.values());
		// [����ִ�, seoul, �����Ϸ�, 10]
		
		// ��� ���4.
		// get(Key) : Key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}
}
