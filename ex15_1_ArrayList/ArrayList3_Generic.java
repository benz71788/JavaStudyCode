package ex15_1_ArrayList;

import java.util.ArrayList;

/*
 * - ���׸���(Generics) jdk 1.5���� ó�� ����
 * 	 �پ��� Ÿ���� ��ü���� �ٷ�� �޼ҵ峪 �÷��� Ŭ������ ������ ���� Ÿ��üũ��
 * 	 ���ִ� ����̴�.
 * - Ŭ���� ���� ����(<>)��ȣ�� �̿��ؼ� �����.
 * - <>�ȿ� Ư�� �ڷ���(Wrapper Ŭ����, String, ����� ���� Ŭ������)�� �־��ָ� �ȴ�
 * - ��� ��)
 * 		List<String>		list = new ArrayList<String>();
 * 		ArrayList<String>	list = new ArrayList<String>();
 * 		ArrayList<Integer>	list = new ArrayList<Integer>();
 * 		ArrayList<Double>	list = new ArrayList<Double>();
 * 		ArrayList<MemberInput>	list = new ArrayList<MemberInput>();
 */
public class ArrayList3_Generic {
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
