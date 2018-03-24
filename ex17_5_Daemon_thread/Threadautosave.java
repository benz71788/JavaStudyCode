package ex17_5_Daemon_thread;

/*
 * ������� �Ϲ� ������ͤ� ���� ������� ������.
 * 
 * ���� ������(daemon thread)��
 * 	�ٸ� �Ϲ� ������(���� �����尡 �ƴ� ������)�� �۾��� ���� �������� ������
 * 	�����ϴ� �������̴�.
 * 	�Ϲ� �����尡 ��� ����Ǹ� ���� ������� ���������� �ڵ� ����ȴ�.
 * 	���� ������� �Ϲ� �������� ���� ������ �����ϹǷ�
 * 	�� ���� �����ϰ�� ���� ������� �Ϲ� ������� �ٸ��� �ʴ�.
 * 	���� �������� ���δ� ������ �÷���, �������μ����� �ڵ�����,
 * 	ȭ���ڵ� ���� ���� �ִ�.
 * 
 * 	���� ������� ���ѷ����� ���ǹ��� �̿��ؼ� ���� �� ����ϰ� �ִٰ�
 * 	Ư�� ������ �����Ǹ�
 * 	�۾��� �����ϰ� �ٽ� ����ϵ��� �ۼ��Ѵ�.
 * 
 * 	���� ������ ����
 * 	������ ���� -> �ݵ�� setDaemon(true)�޼��� ȣ�� -> start()�޼��� ȣ��
 * 	void setDaemon(boolean on) : true(���� ������� ����),
 *  							 false(�Ϲ� ������� ����)
 */
class Threadautosave implements Runnable{
	
	static boolean autoSave = false;
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000);	// 3�ʸ���
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			// autoSave�� ���� true�̸� autoSave()�� ȣ���Ѵ�.
			if(autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
	}

}
