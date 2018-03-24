package ex7_3_default_constructor;

public class ConstrExample2 {
	
	public static void main(String[] args) {
		
		SubscriberInfo ssi = new SubscriberInfo("Harry", "harry123", "asd456");
		
		ssi.printInfo();
		System.out.println();
		
		ssi.phoneNo = "010-2222-2222";
		ssi.address = "Montreal";
		
		ssi.printInfo();
		System.out.println();
		
		ssi.changePassword("lkj0321");
		ssi.setPhoneNo("010-3333-3333");
		ssi.setAddress("Korea");
		
		printSubscriberInfo(ssi);
		
		System.out.println("=====================");
		
		SubscriberInfo ssi2 = new SubscriberInfo(); //생성자의 매개변수가 없을때 호출 가능
		
		ssi2.printInfo();
		
		System.out.println("=====================");
		
		SubscriberInfo ssi3 = new SubscriberInfo("Audi", "audi321", "dfg324", "010-8888-8888", "USA");
		
		printSubscriberInfo(ssi3);
	}
	
	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("Name: " + obj.name);
		System.out.println("ID: " + obj.id);
		System.out.println("PW: " + obj.password);
		System.out.println("Phone No.: " + obj.phoneNo);
		System.out.println("Address: " + obj.address);
	}

}
