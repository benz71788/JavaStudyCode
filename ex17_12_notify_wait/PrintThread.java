package ex17_12_notify_wait;

class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady != true) {	//���̰� ����� �ϰ� �ִ� ���� ���
			/*
			 * ������ ��� - ���� ����� ������ ���� ��� üũ�ؾ� �ߴ�.
			 * while(sharedArea.isReady != true) {
					System.out.println("������~");
				}
			 */
			try {
				synchronized(sharedArea) {
					sharedArea.wait();	//�ٸ� ������� ���� ��ȣ�� ��ٸ���.
						//������ ����� ������ �ٸ� �����忡�� ��ȣ�� ������.
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}// if end
		
		System.out.println("���� ������ ������ = " + sharedArea.result);
	}

}
