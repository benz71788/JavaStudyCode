package ex8_2_constructor;

public class InheritanceExample1 {
	
	public static void main(String[] args) {
		
		String aNo = "1002-111-111111";
		String owName = "Shane";
		String cNo = "5555-6666-7777-8888";
		int bal = 0;
		
		CheckingAccount account = 
				new CheckingAccount(aNo, owName, bal, cNo);	//ปýผบภฺ ศฃรโ
		
		
		account.deposit(1000000);
		
		System.out.println("รัพื : " + account.balance);
		try {
			
			int paidAmount = account.pay(account.cardNo, 47000);
			System.out.println("ม๖บาพื: " + paidAmount);
			System.out.println("ภÜพื: " + account.balance);
			
			paidAmount = account.pay(account.cardNo, 3000);
			System.out.println("ม๖บาพื: " + paidAmount);
			System.out.println("ภÜพื: " + account.balance);
			
			account.deposit(10);
			System.out.println("ภÜพื: " + account.balance);
			
		} catch(Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		
		
	}
	
	

}
