package ex8_15__1_interface_polymorphism;

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
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if(state != 0) {	//ó�� state ����? (0)
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;		//�������: state = 1
		System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
		System.out.println("������: " + borrower);
		System.out.println("������: " + date + "\n");
		
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;		//�ݳ�����: state = 0
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
	}

}
