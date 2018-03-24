package ex8_3_super_constructor;
//��� Ŭ������ ������ Object Ŭ���� �Դϴ�.
//�ٸ� Ŭ�����κ��� ��� �����ʴ� ��� Ŭ������ �ڵ�������
//Object Ŭ������ ���� ��� �޽��ϴ�.

public class Account {	//�����Ϸ��� extends Object�� �߰��մϴ�.
	
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
	
	int withdraw(int amount) throws Exception{	//�����Ѵ�.
		if(balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		
		balance -= amount;
		
		return amount;
	}

}
