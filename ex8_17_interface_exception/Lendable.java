package ex8_17_interface_exception;

interface Lendable {
	
	final static byte STATE_BORROWED = 1;	//대출 중
	final static byte STATE_NORMAL = 0;		//대출되지 않은 상태
	
	//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	public abstract void checkOut(String borrower, String data) throws Exception;
	
	public abstract void checkIn();

}
