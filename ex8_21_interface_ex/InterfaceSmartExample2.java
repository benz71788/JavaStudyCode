package ex8_21_interface_ex;

public class InterfaceSmartExample2 {
	
	public static void main(String[] args) {
		String[] phoneName = {"APhone", "BPhone", "CPhone"};
		SmartFunction2 phone1 = new APhone();
		SmartFunction2 phone2 = new BPhone();
		SmartFunction2 phone3 = new CPhone();
		SmartFunction2[] phone = new SmartFunction2[] {phone1, phone2, phone3};
		
		printSmartInfo(phone, phoneName);
	}
	
	static void printSmartInfo(SmartFunction2[] phone, String[] phoneName) {
		for(int i = 0; i < phone.length; i++) {
			System.out.printf("=====%s=====\n", phoneName[i]);
			phone[i].callingFun();
			phone[i].dataFun();
			phone[i].remoteFun();
		}
	}

}
