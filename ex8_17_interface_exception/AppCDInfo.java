package ex8_17_interface_exception;

public class AppCDInfo extends CDInfo implements Lendable{
	
	String borrower;		//������
	String checkOutDate;	//������
	byte state;				//�������
	AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String date) throws Exception {
		// TODO Auto-generated method stub
		if(state != STATE_NORMAL) {
			throw new Exception("*����Ұ�: " + title);
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + title + " CD�� ����Ǿ����ϴ�.");
		System.out.println("������: " + borrower);
		System.out.println("������: " + date + "\n");
		
	}
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	@Override
	public void checkIn() {		//�ݳ��Ѵ�.
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}

}