package ex17_12_notify_wait;

//notify�޼ҵ�� wait�޼ҵ� ��� ��
/*
 * - ������ ���̿� ��ȣ�� ���� �ְ� ���� �� �ִ�.
 * 	 ����ȭ�� ������� ����ȭ ��Ͽ��� �ٸ� �����忡�� ������� �ѱ��� ���Ѵ�.
 * 	 �̿� ���� ����ȭ�� ��Ͽ��� �����尣�� ���(������� �ѱ�)�� �ϱ� ���ؼ�
 * 	 wait(), notify(), notifyAll() �޼ҵ带 ����ؾ� �Ѵ�.
 * 	 �� �޼ҵ带 ����� ���� synchronized ��Ͽ����� �ǹ̰� �ִ�.
 */
class MultithreadExample {
	
	public static void main(String[] args) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		
		//���� ���� ������ �����ؼ� �� ��ü�� �������� �� �������� �ʵ忡 �����Ѵ�.
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;

		thread1.start();
		thread2.start();
	}

}
