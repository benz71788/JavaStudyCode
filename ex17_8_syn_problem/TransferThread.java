package ex17_8_syn_problem;

class TransferThread extends Thread{
	SharedArea sharedArea;
	
	TransferThread(SharedArea area){	//������
		sharedArea = area;
	}
	
	public void run() {
		for(int cnt = 0; cnt < 12; cnt++) {
			sharedArea.account1.withdraw(1000000);
			System.out.println("�̸��� ����: 100���� ����,");
			sharedArea.account2.deposit(1000000);
			System.out.println("������ ����: 100���� �Ա�,");
		}
	}
}
