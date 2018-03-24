package ex8_16_interface_constant;

public class AppCDInfo extends CDInfo implements Lendable{
	
	String borrower;		//대출인
	String checkOutDate;	//대출일
	byte state;				//대출상태
	AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if(state != STATE_NORMAL) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + title + " CD가 대출되었습니다.");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일: " + date + "\n");
		
	}
	
	//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	@Override
	public void checkIn() {		//반납한다.
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + title + " CD가 반납되었습니다.\n");
	}

}
