package ex7_3_default_constructor;

public class SubscriberInfo {
	
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	
	/*
	 *  매개 변수 없는 생성자 추가 - 
	 * 자바 컴파일러는 클래스에 선언된 생성자가 하나라도 있으면
	 * 디폴트 생성자를 추가하지 않습니다.
	 */
	
	SubscriberInfo(){
		
	}
	
	SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		// this(): 생성자로 같은 클래스의 다른 생성자를 호출할 때 사용한다.
		this(name, id, password);
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
