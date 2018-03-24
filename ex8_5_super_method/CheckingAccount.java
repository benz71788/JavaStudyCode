package ex8_5_super_method;

public class CheckingAccount extends Account{
	
	String cardNo;
	
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		//������ ù �ٿ��� �θ� �����ڸ� ȣ������ �ʾұ� ������ �����Ϸ��� �θ��� �����ڸ�
		//ȣ���ϴ� ������ super();�� ���⿡ �����Ѵ�.
//		this.accountNo = accountNo;	//��� ���� �ʵ� �ʱ�ȭ
//		this.ownerName = ownerName;	//��� ���� �ʵ� �ʱ�ȭ
//		this.balance = balance;		//��� ���� �ʵ� �ʱ�ȭ
		
		super(accountNo, ownerName, balance);	//�Ķ���� 3���� ���� Ŭ����
		this.cardNo = cardNo;		//Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
	}
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance < amount)) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		return withdraw(amount);
	}

}
