package ex8_2_constructor;
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
