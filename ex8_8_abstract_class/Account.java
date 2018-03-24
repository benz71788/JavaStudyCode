package ex8_8_abstract_class;
//�ν��Ͻ�ȭ�� �����ϴ� abstractŰ����


public /*abstract*/ class Account {	//�����Ϸ��� extends Object�� �߰��մϴ�.
	
	String accountNo;	//���¹�ȣ
	String ownerName;	//������ �̸�
	int balance;		//�ܾ�
	
	//�⺻ �����ڸ� �����Ϸ��� �ڵ� �߰��մϴ�.
//	Account(){
//		
//	}
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {	//�����Ѵ�.
		balance += amount;
	}
	
	/*final*/ int withdraw(int amount) throws Exception{	//�����Ѵ�.
		if(balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		
		balance -= amount;
		
		return amount;
	}

}
