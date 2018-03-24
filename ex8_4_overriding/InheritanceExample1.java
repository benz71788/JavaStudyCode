package ex8_4_overriding;

public class InheritanceExample1 {
	
	public static void main(String[] args) {
		
		String aNo = "1002-111-111111";
		String owName = "Shane";
		int bal = 100000;
		int cre = 10000;
		
		CreditLineAccount credit =
				new CreditLineAccount(aNo, owName, bal, cre);
		

		System.out.println("�Ѿ� : " + credit.balance);
		
		credit.deposit(1000000);
		
		System.out.println("�Ѿ�(���̳ʽ� �ѵ� ����) : " + credit.balance);
		
		try {
			
			int amount = credit.withdraw(50000);
//			int amount = credit.withdraw(5000000);			
			System.out.println("�����: " + amount);
			System.out.println("�ܾ�: " + credit.balance);
			System.out.println("���̳ʽ� �ѵ�: " + credit.creditLine);
			
		} catch(Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		
		
	}
	
	

}
