package ex8_4_overriding;

public class InheritanceExample1 {
	
	public static void main(String[] args) {
		
		String aNo = "1002-111-111111";
		String owName = "Shane";
		int bal = 100000;
		int cre = 10000;
		
		CreditLineAccount credit =
				new CreditLineAccount(aNo, owName, bal, cre);
		

		System.out.println("총액 : " + credit.balance);
		
		credit.deposit(1000000);
		
		System.out.println("총액(마이너스 한도 포함) : " + credit.balance);
		
		try {
			
			int amount = credit.withdraw(50000);
//			int amount = credit.withdraw(5000000);			
			System.out.println("인출액: " + amount);
			System.out.println("잔액: " + credit.balance);
			System.out.println("마이너스 한도: " + credit.creditLine);
			
		} catch(Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		
		
	}
	
	

}
