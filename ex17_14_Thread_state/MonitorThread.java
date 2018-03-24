package ex17_14_Thread_state;

class MonitorThread extends Thread{
	
	Thread thread;
	MonitorThread(Thread thread){	//������
		this.thread = thread;
	}
	
	//����͸� ��� ������(thread)�� ���¸� 2�ʸ��� �ѹ��� ����մϴ�.
	public void run() {
		while(true) {
			//thread.getState() : �������� ���¸� ���´�.
			Thread.State state = thread.getState();
			
			System.out.println(thread.getName() + " �������� ����: " + state);
			
			//�������� ���°� ���� ������ ��� �ݺ����� �����.
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			} //catch end
		} //while end
	} //run end
} //class end