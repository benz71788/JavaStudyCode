package ex9_enum_hw;

interface Lendable2 {
	
	enum BookState {
		
		STATE_NORMAL, STATE_BORROWED
	}

	
	//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	public abstract void checkOut(String borrower, String data) throws Exception;
	
	public abstract void checkIn();

}
