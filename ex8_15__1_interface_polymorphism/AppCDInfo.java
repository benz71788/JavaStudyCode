package ex8_15__1_interface_polymorphism;

public class AppCDInfo extends CDInfo implements Lendable{
	
	String borrower;		//������
	String checkOutDate;	//������
	byte state;				//�������
	AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if(state != 0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
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
		this.state = 0;
		System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}

}
