package ex8_17_interface_exception;

class SeparateVolume implements Lendable{

	String requestNo;		//û����ȣ
	String bookTitle;		//����
	String writer;			//����
	String borrower;		//������
	String checkOutDate;	//������
	byte state;				//�������
	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	@Override
	public void checkOut(String borrower, String date) throws Exception{

		// TODO Auto-generated method stub
		if(state != STATE_NORMAL) {	//ó�� state ����? (0)
			throw new Exception("*����Ұ�: " + bookTitle);
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;		//�������: state = 1
		System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
		System.out.println("������: " + borrower);
		System.out.println("������: " + date + "\n");

		
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;		//�ݳ�����: state = 0
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
	}

}
