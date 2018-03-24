package ex17_8_syn_problem;

class TransferThread extends Thread{
	SharedArea sharedArea;
	
	TransferThread(SharedArea area){	//»ı¼ºÀÚ
		sharedArea = area;
	}
	
	public void run() {
		for(int cnt = 0; cnt < 12; cnt++) {
			sharedArea.account1.withdraw(1000000);
			System.out.println("ÀÌ¸ù·æ °èÁÂ: 100¸¸¿ø ÀÎÃâ,");
			sharedArea.account2.deposit(1000000);
			System.out.println("¼ºÃáÇâ °èÁÂ: 100¸¸¿ø ÀÔ±İ,");
		}
	}
}
