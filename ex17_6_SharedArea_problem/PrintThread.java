package ex17_6_SharedArea_problem;

class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		//���� ������ �����͸� ���
		System.out.println("���� ������ ������ = " + sharedArea.result);
	}

}
