package ex17_4_Runnable_Interface;

class MultithreadExample4 {
	
	public static void main(String[] args) {
		ThreadLife t1 = new ThreadLife();
		
		//ù ��° Thread ����
		Thread first = new Thread(t1, "first1");
		//������ ���� : Thread(Runnable target, String name)
		//Allocates a new Thread object.
		
		//�� ��° Thread ����
		Thread second = new Thread(t1, "second1");
		
		//�� ��° Thread ����
		Thread third = new Thread(t1, "thrid1");
		
		/*
		 * ������� �켱����(priority)��� �Ӽ�(�������)�� ������ �ִµ�
		 * �� �켱������ ���� ���� �����尡 ��� ����ð��� �޶�����.
		 * �����尡 �����ϴ� �۾��� �߿䵵�� ���� �������� �켱������
		 * ���� �ٸ��� �����Ͽ� Ư�� �����尡 �� ���� �۾��ð��� ������ �� �� �ִ�
		 * ���α׷����� �켱 ������ �������� ������ �켱 ������ 5�� ��µȴ�.
		 * �ִ� �켱 ���� : public static final int MAX_PRIORITY = 10; 
		 * ���� ������     : public static final int NORM_PRIORITY = 5;
		 * ���� ����       : public static final int MIN_PRIORITY = 1;
		 */
		System.out.println("Thread�� �켱������ ����ϴ� �κ�");
		//��������(1)�� �����ϴ� �κ�
		first.setPriority(Thread.MIN_PRIORITY);
		System.out.println("first priority = \t" + first.getPriority());
		
		//�ְ� ����(10)�� �����ϴ� �κ�
		second.setPriority(Thread.MAX_PRIORITY);
		System.out.println("second priority = \t" + second.getPriority());
		
		//���� ������(5)�� �����ϴ� �κ�
//		third.setPriority(Thread.NORM_PRIORITY);
		System.out.println("third priority = \t" + third.getPriority());
		
		first.start();
		second.start();
		third.start();
	}

}
