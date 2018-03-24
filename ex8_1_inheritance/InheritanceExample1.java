package ex8_1_inheritance;

public class InheritanceExample1 {
	
	public static void main(String[] args) {
		
		CheckingAccount account = new CheckingAccount();
		
		account.accountNo = "1002-111-111111";
		account.ownerName = "Shane";
		account.cardNo = "5555-6666-7777-8888";
		
		account.deposit(1000000);
		
		System.out.println("�Ѿ� : " + account.balance);
		try {
			
			int paidAmount = account.pay(account.cardNo, 47000);
			System.out.println("���Ҿ�: " + paidAmount);
			System.out.println("�ܾ�: " + account.balance);
			
			paidAmount = account.pay(account.cardNo, 3000000);
			System.out.println("���Ҿ�: " + paidAmount);
			System.out.println("�ܾ�: " + account.balance);
			
			account.deposit(10);
			System.out.println("�ܾ�: " + account.balance);
			
		} catch(Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		
		
	}
	
	

}
