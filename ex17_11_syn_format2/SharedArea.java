package ex17_11_syn_format2;

class SharedArea {
	Account account1;	// ÀÌ¸ù·æÀÇ °èÁÂ
	Account account2;	// ¼ºÃáÇâÀÇ °èÁÂ
	
	synchronized void transfer() {		// °èÁÂ ÀÌÃ¼¸¦ ÇÑ´Ù.
		account1.withdraw(1000000);
		account2.deposit(1000000);
	}//transfer() end
	
	synchronized int getTotal() {		// ÀÜ¾× ÇÕ°è¸¦ ±¸ÇÑ´Ù.
		return account1.balance + account2.balance;
	}	//getTotal() end
}
