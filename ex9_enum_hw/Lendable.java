package ex9_enum_hw;

interface Lendable {
	
	enum BookState {
		
		STATE_NORMAL("���� ����"), STATE_BORROWED("���� ��");
		final private String check;
		
		private BookState(String check) {
			this.check = check;
		}
		
		String value() {
			return check;
		}

	}
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public abstract void checkOut(String borrower, String data) throws Exception;
	
	public abstract void checkIn();

}
