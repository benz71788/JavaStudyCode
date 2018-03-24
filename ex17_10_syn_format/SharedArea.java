package ex17_10_syn_format;

class SharedArea {
	Account account1;	// �̸����� ����
	Account account2;	// �������� ����
	
	void transfer() {		// ���� ��ü�� �Ѵ�.
		synchronized(this) {	//this:����ȭ�� ��ü�� �ڱ� �ڽ��̴�.
			account1.withdraw(1000000);
			account2.deposit(1000000);
		}// ����ȭ ��
	}//transfer() end
	
	int getTotal() {		// �ܾ� �հ踦 ���Ѵ�.
		synchronized(this) {
			return account1.balance + account2.balance;
		}	// ����ȭ ��
	}	//getTotal() end
}
