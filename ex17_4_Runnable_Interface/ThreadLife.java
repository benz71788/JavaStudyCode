package ex17_4_Runnable_Interface;

//������� �ȳ��Ϳ� - ������ ������ ����� �޶�����
class ThreadLife implements Runnable{
	//�ݵ�� �������̵� �ؾ� �Ѵ�.
	public void run() {
		for(int i = 1; i < 3; i++) {
			//���� ���� ���� Thread�� �̸��� ���� ���
			System.out.println("���� ���� ���� �������� �̸��� " + 
					Thread.currentThread().getName() + "�̰�, "
					+ "\t number = " + i);
		}
	}
}
