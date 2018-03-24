package ex8_17_interface_exception;

interface Lendable {
	
	final static byte STATE_BORROWED = 1;	//���� ��
	final static byte STATE_NORMAL = 0;		//������� ���� ����
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public abstract void checkOut(String borrower, String data) throws Exception;
	
	public abstract void checkIn();

}
