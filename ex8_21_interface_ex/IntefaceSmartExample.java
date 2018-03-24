package ex8_21_interface_ex;

public class IntefaceSmartExample {
	
	public static void main(String[] args) {
		
		SmartPhone phoneA = new SmartPhone("A", "����", "3G", "ž��");
		SmartPhone phoneB = new SmartPhone("B", "����", "4G", "��ž��");
		SmartPhone phoneC = new SmartPhone("C", "����", "4G", "ž��");
		SmartPhone[] phone = new SmartPhone[] {phoneA, phoneB, phoneC};
		
		printSmartInfo(phone);
	}
	
	static void printSmartInfo(SmartPhone[] phone){
		for(int i = 0; i < phone.length; i++) {			
			System.out.printf("=======%sPhone=======\n", phone[i].type);
			System.out.printf("��ȭ ��/������ %s�մϴ�.\n", phone[i].call);
			System.out.printf("�����ʹ� %s�Դϴ�.\n", phone[i].data);
			System.out.printf("TV �������� %s �Ǿ����ϴ�.\n", phone[i].remote);
			System.out.println("=====================");	
		}
	}
}


