package ex9_enum_hw;

import ex9_enum_hw.Lendable2.BookState;

public class InterfaceExample2 {
	
	public static void main(String[] args) {
		
		SeparateVolume2 separate = new SeparateVolume2("863��", "����", "��������");
		
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
	
	static void printState(SeparateVolume2 separate) {
		//�������̽� Lendable�� �������� ���� Ŭ���������� ����
		//�������̽�.�ʵ�
		if(separate.state == BookState.STATE_NORMAL) {
			System.out.println("========================");
			System.out.println("���� ����: ������ �����մϴ�.");
			System.out.println("========================");
		} 
		if(separate.state == BookState.STATE_BORROWED) {
			System.out.println("========================");
			System.out.println("���� ����: �������Դϴ�.");
			System.out.println("������: " + separate.borrower);
			System.out.println("������: " + separate.checkOutDate);
			System.out.println("========================");
		}
	
	}
}
