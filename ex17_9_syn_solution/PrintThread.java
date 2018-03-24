package ex17_9_syn_solution;

class PrintThread extends Thread{
	
	SharedArea sharedArea;
	
	PrintThread(SharedArea area){
		sharedArea = area;
	}
	
	public void run() {
		for(int cnt = 0; cnt < 3; cnt++) {
			/*
			 * synchronized Ű���带 ����ؼ� ������� ���� �κ���
			 * ����ȭ ���̶�� �Ѵ�.
			 */
			//����ȭ ����
			synchronized(sharedArea) {
				int sum = sharedArea.account1.balance +
						sharedArea.account2.balance;
				System.out.println("���� �ܾ� �հ�: " + sum);
			}
			//����ȭ ��
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
