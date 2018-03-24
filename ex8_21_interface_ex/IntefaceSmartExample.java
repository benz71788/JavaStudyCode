package ex8_21_interface_ex;

public class IntefaceSmartExample {
	
	public static void main(String[] args) {
		
		SmartPhone phoneA = new SmartPhone("A", "가능", "3G", "탑재");
		SmartPhone phoneB = new SmartPhone("B", "가능", "4G", "미탑재");
		SmartPhone phoneC = new SmartPhone("C", "가능", "4G", "탑재");
		SmartPhone[] phone = new SmartPhone[] {phoneA, phoneB, phoneC};
		
		printSmartInfo(phone);
	}
	
	static void printSmartInfo(SmartPhone[] phone){
		for(int i = 0; i < phone.length; i++) {			
			System.out.printf("=======%sPhone=======\n", phone[i].type);
			System.out.printf("전화 송/수신이 %s합니다.\n", phone[i].call);
			System.out.printf("데이터는 %s입니다.\n", phone[i].data);
			System.out.printf("TV 리모콘이 %s 되었습니다.\n", phone[i].remote);
			System.out.println("=====================");	
		}
	}
}


