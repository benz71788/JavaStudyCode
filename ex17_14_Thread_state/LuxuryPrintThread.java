package ex17_14_Thread_state;

class LuxuryPrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady != true) {	//���̰� ����� �ϰ� �ִ� ���� ���
			try {
				synchronized(sharedArea) {
					sharedArea.wait();	//�ٸ� ������� ���� ��ȣ�� ��ٸ���.
						//������ ����� ������ �ٸ� �����忡�� ��ȣ�� ������.
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}// if end
		System.out.printf("*** �� = " + sharedArea.result + " ***\n");
	}
	

}