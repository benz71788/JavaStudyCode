package ex17_6_SharedArea_solution;

//CalcThread�� ���� ���� ���� ���� ������ ���⵵ ����
//PrintThread�� ���� ������ �����͸� �о� ���� ������
//result �ʵ尡 ������ �ִ� �⺻�� 0.0�� ��µ� ���̴�.
//�ذ�å??
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
