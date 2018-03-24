package ex15_6_HashMap_TreeMap;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/*
 * Set �������̽�
 * 	- HashSet(��ӹ޴� Ŭ����) : ���������� HashMap�� �̿��ؼ� �����������
 * 		HashSet�̶� �̸��� �ؽ��� �̿��ؼ� �����߱� ������ �ٿ��� ���̴�.
 * 	- TreeSet�� ���� �˻� Ʈ��(binary search tree)���
 * 		�ڷᱸ���� ���·� �����͸� �����ϴ� �÷��� Ŭ�����̴�.
 * 	1. �������� �ڷ���(�⺻ �ڷ���, ������ ���)�� Data�� ��� ������ �� �ִ�
 * 		ex) int, double, char, boolean, String etc
 * 	2. ���� ���� ��, ��� �Ѵ�.
 * 	3. �ߺ��� Data�� �������� ���Ѵ�.
 * 		��) �ζ� ��ȣ 6���� �ߺ� ���� �ʰ� �ϴ� ���α׷��� �̿�
 */
class HashSet_add_remove {
	public static void main(String[] args) {
		// HashSet Ŭ������ ��ü ����
		Set hs = new HashSet();
//		HashSet hs = new HashSet();
		
		// hs ��ü�� ������ ��ü ����
		// ��ĳ���� hs.add(new String("���ƿ�"));
		// ��ĳ����(�Ű������� Object���̱� ������)
		hs.add("���ƿ�");
		hs.add("��ſ� �Ϸ�");
		
//		Date d = new Date();
//		hs.add(d);
		hs.add(new Date());	//�� �� ����� ���� �ǹ�
		
		//hs ��ü�� �����ϰ� �ִ� ������ ��ü ���
		System.out.println("hs�� ����: " + hs);
		
		//"��ſ� �Ϸ�" ������ ��ü�� hs��ü���� ����
		hs.remove("��ſ� �Ϸ�");
		System.out.println("hs�� ����: " + hs);
		
		System.out.println("\"���ƿ�\"�� �ֳ���? " + hs.contains("���ƿ�"));
	}
}
