package ex8_15__1_interface_polymorphism;

interface Lendable {
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public abstract void checkOut(String borrower, String data);
	
	public abstract void checkIn();

}
