package ex8_15__1_interface_polymorphism;

interface Lendable {
	
	//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	public abstract void checkOut(String borrower, String data);
	
	public abstract void checkIn();

}
