package ex9_enum_hw;

interface Lendable2 {
	
	enum BookState {
		
		STATE_NORMAL, STATE_BORROWED
	}

	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public abstract void checkOut(String borrower, String data) throws Exception;
	
	public abstract void checkIn();

}
