package ex8_16_interface_constant;

interface Lendable {
	
	final static byte STATE_BORROWED = 1;	//���� ��
	final static byte STATE_NORMAL = 0;		//������� ���� ����
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public abstract void checkOut(String borrower, String data);
	
	public abstract void checkIn();

}
