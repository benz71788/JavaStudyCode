package ex15_5_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ť(Queue) �������̽�
 * 	- LinkedList(Queue �������̽��� ������ Ŭ����)�� ���
 * 	- FIFO(First Input First Output) ����
 * 		���� �Էµ� �ڷᰡ ���� ��µǴ� ����
 */
class Queue1 {
	
	public static void main(String[] args) {
		// ť�� ����� LinkedList ��ü�� �����Ѵ�.
		// LinkedList<String> queue = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		System.out.println("�������? " + queue.isEmpty());
		
		//offer() �޼ҵ� : ť�� 3���� �����͸� �߰�
		queue.offer("�䳢");
		queue.offer("�罿");
		queue.offer("ȣ����");
		
		//peek() �޼ҵ� : ó�� �����͸� �״�� �� ���·� �����´�.
		System.out.println(queue.peek());
		System.out.println("�������? " + queue.isEmpty());	// false - ������� �Ǵ�
		System.out.println("���� = " + queue.size());
		
		System.out.println("poll() ���");
		while(!queue.isEmpty()) {
			System.out.println("==================");
			System.out.println("������ ���: " + queue.poll());
		}
		System.out.println("==================");                                                                                          
		System.out.println("�������? " + queue.isEmpty());	// true - ������� �Ǵ�
	}

}
