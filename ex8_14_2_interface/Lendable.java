package ex8_14_2_interface;

interface Lendable {
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public abstract void checkOut(String borrower, String data);
	
	public abstract void checkIn();

}
