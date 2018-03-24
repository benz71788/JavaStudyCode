package ex8_5_super_method;

public class BonusPointAccount extends Account {
	
	int bonusPoint;
	
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint){
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
	
	void deposit(int amount) {	//예금한다.
//		balance += amount;
		super.deposit(amount);
		bonusPoint += (int)(amount * 0.0001);
	}

}
