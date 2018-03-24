package ex15_1_ArrayList;

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
class ArrayList3_Generics_String {
	
	public static void main(String[] args) {
		//ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();		
		
		//list�� 3���� �����͸� �߰�
		list.add("����");
		list.add("����");
		list.add("������");
		
		int num = list.size();	//list�� �ִ� �������� ���� ���ϴ� �޼ҵ�
		
		//list�� �ִ� �������� ����ŭ �ݺ��ϸ鼭 �����͸� �����ͼ� ���
		for(int cnt = 0; cnt < num; cnt++) {
			//get(index)�޼ҵ带 ����Ͽ� index��ġ�� �ִ� �ڷḦ �����´�.
			String str = list.get(cnt);
			/*
			 * get(i)�� ��ȯ���� Object�������� Generic���� �����߱� ������
			 * (String)�� ������ �� �ִ�.
			 * temp = (String)vec.get(i);
			 * Generic�� ������� ���� ��쿡�� ��ȯ���� ��������� �����ؾ� �Ѵ�.
			 */
			System.out.println(str);
		}
		
		System.out.println("===== ���� for �� =====");
		for(String str : list) {
			System.out.println(str);
		}
	}
}
