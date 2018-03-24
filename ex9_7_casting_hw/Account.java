package ex9_7_casting_hw;

public class Account {
	
    String accountNo;
    String ownerName;
    int balance;
    Account(String accountNo, String ownerName, 
    		int balance) {       // 생성자
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    void deposit(int amount) {
        balance += amount;
    }
    
    int withdraw(int amount) throws Exception {
        if (balance < amount)
            throw new Exception("잔액이 부족합니다.");
        balance -= amount;
        return amount;
    }

}
