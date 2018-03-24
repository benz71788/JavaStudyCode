package ex17_14_Thread_state;

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
		thread1.setName("Calculator Thread");
		
		PrintThread thread2 = new PrintThread();
		thread2.setName("Print Thread");
		
		//���Ŀ�� ������ ����
		//CalcThread ����͸�
		MonitorThread thread3 = new MonitorThread(thread1);

		//����͸� ������ ����
		//PrintThread ����͸�
		MonitorThread thread4 = new MonitorThread(thread2);
		
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
