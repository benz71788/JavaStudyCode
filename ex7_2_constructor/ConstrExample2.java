package ex7_2_constructor;

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
		
		ssi.printInfo();
		
		System.out.println("=====================");
		
		SubscriberInfo ssi2 = new SubscriberInfo("Benz", "benz321", "dsa654", "010-1111-1111", "Canada");
		
		ssi2.printInfo();
		System.out.println();
		
		ssi2.changePassword("ksdf5432");
		ssi2.setPhoneNo("010-5555-5555");
		ssi2.setAddress("Germany");
		
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
