package ex9_enum_hw;

class SeparateVolume2 implements Lendable2{

	String requestNo;		//û����ȣ
	String bookTitle;		//����
	String writer;			//����
	String borrower;		//������
	String checkOutDate;	//������
	BookState state;				//�������
	SeparateVolume2(String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		this.state = BookState.STATE_NORMAL;
	}
	
	
	
	@Override
	public void checkOut(String borrower, String date) throws Exception{

		// TODO Auto-generated method stub
		if(state != BookState.STATE_NORMAL) {	//ó�� state ����? (0)
			throw new Exception("*����Ұ�: " + bookTitle);
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = BookState.STATE_BORROWED;		//�������: state = 1
		System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
		System.out.println("������: " + borrower);
		System.out.println("������: " + date + "\n");

		
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = BookState.STATE_NORMAL;		//�ݳ�����: state = 0
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
	}

}
