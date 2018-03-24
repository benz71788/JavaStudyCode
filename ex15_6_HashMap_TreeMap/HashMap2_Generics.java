package ex15_6_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Set;

class HashMap2_Generics {
	public static void main(String[] args) {
		// HashMap ��ü ���� ��� �ΰ���
		// Map hm = new HashMap(); // ���1. ��ĳ����
		HashMap<String, Object> hm = new HashMap<String, Object>(); // ���2. ���� Ŭ������ ���� ��ü ����
		
		// Key�� Value ���� ����
		// Map�� �޼ҵ�� put�� �̿��� (Key, Value) ������ �ڷ� �����Ѵ�.
		hm.put("woman", "����ִ�");
		hm.put("man", "�����Ϸ�");
		hm.put("grade", new String("10"));
		hm.put("age", new Integer(10));	// hm.put("age", 10)
		hm.put("city", "seoul");
		
		// HashMap�� �ִ� ��ü���� ���
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
		
		// ��� ���5.
		System.out.println("===========================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
