package ex7_2_constructor;

public class SubscriberInfo {
	
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	
	SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void changePassword(String password) {
		this.password = password;
	}
	
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("ID: " + this.id);
		System.out.println("PW: " + this.password);
		System.out.println("Phone No.: " + this.phoneNo);
		System.out.println("Address: " + this.address);
	}

}
