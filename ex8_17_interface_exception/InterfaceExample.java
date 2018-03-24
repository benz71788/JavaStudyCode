package ex8_17_interface_exception;

public class InterfaceExample {
	
	public static void main(String[] args) {
		
		SeparateVolume separate = new SeparateVolume("863��", "����", "��������");
		
		printState(separate);
	
		try {
			separate.checkOut("SEONGHEE LEE", "20180219");
			separate.checkOut("SEONGHEE LEE", "20180219");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		printState(separate);
		
	}
	
	static void printState(SeparateVolume separate) {
		//�������̽� Lendable�� �������� ���� Ŭ���������� ����
		//�������̽�.�ʵ�
		if(separate.state == Lendable.STATE_NORMAL) {
			System.out.println("========================");
			System.out.println("���� ����: ������ �����մϴ�.");
			System.out.println("========================");
		} 
		if(separate.state == Lendable.STATE_BORROWED) {
			System.out.println("========================");
			System.out.println("���� ����: �������Դϴ�.");
			System.out.println("������: " + separate.borrower);
			System.out.println("������: " + separate.checkOutDate);
			System.out.println("========================");
		}
	
	}
}
