package ex9_enum_hw;

interface Lendable {
	
	enum BookState {
		
		STATE_NORMAL("대출 가능"), STATE_BORROWED("대출 중");
		final private String check;
		
		private BookState(String check) {
			this.check = check;
		}
		
		String value() {
			return check;
		}

	}
	
	//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	public abstract void checkOut(String borrower, String data) throws Exception;
	
	public abstract void checkIn();

}
