package ex17_1_Thread;

/*
 * - java.lang.Thread Ŭ������ �� Ŭ������ ���� Ŭ������
 * 	 Thread(������) Ŭ������� �Ѵ�.
 * - �����尡 �� ���� run �޼ҵ� �ȿ� �ۼ��ؾ� �Ѵ�.
 * - public void run()�� �������� �ۼ��Ѵ�.
 */

class DigitThread extends Thread{
	//�������̵� - �������̵� ���ص� ������ ����
	//start() �޼ҵ忡 ���� ����ȴ�
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
		}
		
		System.out.println("������ �̸�2: " + Thread.currentThread().getName());
	}
}
