package ex17_6_SharedArea_solution;

class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		//���� ������ �����͸� ���
		while(sharedArea.isReady != true) {
			System.out.println("������~");
		}
		//���� ������ �����͸� ���
		System.out.println("���� ������ ������ = " + sharedArea.result);
	}

}
