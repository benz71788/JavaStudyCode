package ex17_14_Thread_state;

class CalcThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		double total = 0.0;
		// ���̸� ����ϴ� �κ�
		for(int cnt = 1; cnt < 1000000000; cnt += 2) {
			if(cnt / 2 % 2 == 0) {
				total += 1.0 / cnt;
//				System.out.println("if : " + cnt + ", total : " + total);
			} else {
				total -= 1.0 / cnt;
//				System.out.println("else : " + cnt + ", total : " + total);
			}
		}
		// ��� ����� ���� ������ ����
		sharedArea.result = total * 4;
		
		// SharedArea ��ü�� isReady �ʵ� ���� true�� ����
		sharedArea.isReady = true;	//���� ��� �����ٶ�� �ǹ�
		
		synchronized(sharedArea) {
			sharedArea.notify(); // � ������� ��ȣ�� ������ �޼ҵ�
		}
	}
	
}
