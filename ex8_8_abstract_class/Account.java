package ex8_8_abstract_class;
//인스턴스화를 금지하는 abstract키워드


public /*abstract*/ class Account {	//컴파일러가 extends Object를 추가합니다.
	
	String accountNo;	//계좌번호
	String ownerName;	//예금주 이름
	int balance;		//잔액
	
	//기본 생성자를 컴파일러가 자동 추가합니다.
//	Account(){
//		
//	}
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {	//예금한다.
		balance += amount;
	}
	
	/*final*/ int withdraw(int amount) throws Exception{	//인출한다.
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		
		balance -= amount;
		
		return amount;
	}

}
