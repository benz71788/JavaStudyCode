package ex17_13_notifyAll_wait;

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
		PrintThread printThread	 = new PrintThread();
		SimplePrintThread simpleThread = new SimplePrintThread();
		LuxuryPrintThread luxuryThread = new LuxuryPrintThread();
		
		//���� ���� ������ �����ؼ� �� ��ü�� �������� �� �������� �ʵ忡 �����Ѵ�.
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		printThread.sharedArea = obj;
		simpleThread.sharedArea = obj;
		luxuryThread.sharedArea = obj;

		thread1.start();
		printThread.start();
		simpleThread.start();
		luxuryThread.start();
	}

}
