package ex8_6_final_class;

public class InheritanceExample1 {
	
	public static void main(String[] args) {
		
		String aNo = "1002-111-111111";
		String owName = "Shane";
		int bal = 0;
		int bonus = 0;
		
		BonusPointAccount bonusAcc =
				new BonusPointAccount(aNo, owName, bal, bonus);
		
		System.out.println("총액 : " + bonusAcc.balance);
	
		try {
			
			bonusAcc.deposit(500000);
//			int amount = bonusAcc.withdraw(5000000);
			System.out.println("잔액: " + bonusAcc.balance);
			System.out.println("누적 포인트 적립: " + bonusAcc.bonusPoint);
			
			bonusAcc.deposit(500000);
			System.out.println("잔액: " + bonusAcc.balance);
			System.out.println("누적 포인트 적립: " + bonusAcc.bonusPoint);
			
			
		} catch(Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		
		
	}
	
	

}
