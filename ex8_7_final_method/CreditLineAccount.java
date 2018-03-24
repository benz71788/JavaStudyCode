package ex8_7_final_method;

public class CreditLineAccount extends Account {
	
	int creditLine;
	
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine){
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	int withdraw(int amount) throws Exception{
		if((balance + creditLine) < amount) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		
		balance -= amount;

		return amount;
	}

}