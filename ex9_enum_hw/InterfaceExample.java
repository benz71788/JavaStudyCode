package ex9_enum_hw;

import ex9_enum_hw.Lendable.BookState;

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
		if(separate.state == BookState.STATE_NORMAL) {
			System.out.println("========================");
			System.out.println("���� ����: " + BookState.STATE_NORMAL.value());
			System.out.println("========================");
		} 
		if(separate.state == BookState.STATE_BORROWED) {
			System.out.println("========================");
			System.out.println("���� ����: " + BookState.STATE_BORROWED.value());
			System.out.println("������: " + separate.borrower);
			System.out.println("������: " + separate.checkOutDate);
			System.out.println("========================");
		}
	
	}
}
