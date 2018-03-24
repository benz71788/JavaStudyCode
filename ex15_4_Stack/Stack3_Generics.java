package ex15_4_Stack;

import java.util.Stack;

/*
 *Generic ���
 *java.lang.Object
 *	java.util.AbstractCollection<E>
 *		java.util.AbstractList<E>
 *			java.util.Vector<E>
 *				java.util.Stack<E>
 *����(Stack) Ŭ���� : Vector Ŭ������ �ڽ� Ŭ�����̴�.
 *		1. LIFO(Last In - First Out) ����
 *			���������� �Էµ� �ڷᰡ ���� ���� ��µǴ� ����
 *		2. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
 */
class Stack3_Generics {
	
	public static void main(String[] args) {
		
		//Stack ��ü ����
		Stack<String> s = new Stack<String>();
		System.out.println("�������? " + s.empty());	// true - ������� �Ǵ�
		
		// Stack�� ���� ����
		s.push("���ƿ�");
		s.push("�ں���");
		
		// Stack�� ���� ���
		System.out.println("�������? " + s.empty());	// false - ������� �Ǵ�
		System.out.println("�� ������ ������ : " + s.peek());	//������ ������ ��������
		
		// Stack�� ���� ���
		while(!s.empty()) {
			System.out.println("==============");
			System.out.println("������ ���: " + s.pop());
			System.out.println("���� ������ ����: " + s.size());
			
		}
		System.out.println("�������? " + s.empty());	// true - ������� �Ǵ�
	}

}
