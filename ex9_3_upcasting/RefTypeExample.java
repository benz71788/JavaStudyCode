//obj ������ Ÿ���� Account�̱� ������ ���� �߻�
package ex9_3_upcasting;

public class RefTypeExample {
	
	public static void main(String[] args) {
		Account obj1 =
				new CheckingAccount("111-22-333333", "ȫ�浿", 10, "4444-5555-6666-7777");
		
		CheckingAccount obj = (CheckingAccount) obj1; //
		
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("�����: " + amount);
			System.out.println("ī���ȣ: " + obj.cardNo);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
