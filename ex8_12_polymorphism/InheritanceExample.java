package ex8_12_polymorphism;

public class InheritanceExample {
	
	public static void main(String[] args) {
		Account obj1 = 
				new Account("111-22-333333", "임꺽정", 10000);
		CheckingAccount obj2 = 
				new CheckingAccount("444-55-666666", "홍길동", 20000, "5555-6666-7777-8888");
		CreditLineAccount obj3 = 
				new CreditLineAccount("777-88-999999", "김선달", 30000, 20000000);
		BonusPointAccount obj4 = 
				new BonusPointAccount("000-00-000000", "김미영", 0, 0);
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}
	
	// 다양한 타입의 객체를 한 타입의 파라미터로 받습니다.
	static void printAccountInfo(Account obj) {
		System.out.println("Account Number: " + obj.accountNo);
		System.out.println("Owner Name: " + obj.ownerName);
		System.out.println("Balance: " + obj.balance);
		System.out.println();
	}

}
