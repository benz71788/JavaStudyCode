package ex17_11_syn_format2;

class SharedArea {
	Account account1;	// �̸����� ����
	Account account2;	// �������� ����
	
	synchronized void transfer() {		// ���� ��ü�� �Ѵ�.
		account1.withdraw(1000000);
		account2.deposit(1000000);
	}//transfer() end
	
	synchronized int getTotal() {		// �ܾ� �հ踦 ���Ѵ�.
		return account1.balance + account2.balance;
	}	//getTotal() end
}
