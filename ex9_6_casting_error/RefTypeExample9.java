package ex9_6_casting_error;

public class RefTypeExample9 {
	
	public static void main(String[] args) {
		
		Account obj = new Account("111-22-333333", "ȫ�浿", 100000);
		
		//obj�� CheckingAccount�� ĳ��Ʈ ������ ���� Ȯ��
		if(obj instanceof CheckingAccount) {
			//obj�� CheckingAccount�� ĳ��Ʈ�� �� ���� ���� pay�޼��� ȣ��
			pay((CheckingAccount) obj);
		} else {
			//obj�� CheckingAccount�� ĳ��Ʈ�� �� ���� ���
			System.out.println("ĳ��Ʈ�� �� ���� Ÿ�Դϴ�.");
		}
		
	}
	
	static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("�����: " + amount);
			System.out.println("ī���ȣ: " + obj.cardNo);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
