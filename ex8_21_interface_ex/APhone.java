package ex8_21_interface_ex;

public class APhone implements SmartFunction2{

	String phoneName;
	String call;
	String data;
	String remote;
	APhone(){
		
	}

	
	@Override
	public void callingFun() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ��/������ �����մϴ�.");
	}

	@Override
	public void dataFun() {
		// TODO Auto-generated method stub
		System.out.println("�����ʹ� 3G�Դϴ�.");
	}

	@Override
	public void remoteFun() {
		// TODO Auto-generated method stub
		System.out.println("TV �������� ž�� �Ǿ����ϴ�.");
	}

}
