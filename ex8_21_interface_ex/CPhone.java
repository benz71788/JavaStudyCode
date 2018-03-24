package ex8_21_interface_ex;

public class CPhone implements SmartFunction2{
	String phoneName;
	String call;
	String data;
	String remote;
	CPhone(){
		
	}
	
	@Override
	public void callingFun() {
		// TODO Auto-generated method stub
		System.out.println("전화 송/수신이 가능합니다.");
	}

	@Override
	public void dataFun() {
		// TODO Auto-generated method stub
		System.out.println("데이터는 4G입니다.");
	}

	@Override
	public void remoteFun() {
		// TODO Auto-generated method stub
		System.out.println("TV 리모콘이 탑재 되었습니다.");
	}

}
