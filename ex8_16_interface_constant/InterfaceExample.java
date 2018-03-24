package ex8_16_interface_constant;

public class InterfaceExample {
	
	public static void main(String[] args) {
		
		SeparateVolume separate = new SeparateVolume("863��", "����", "��������");
		
		printState(separate);
		
		separate.checkOut("SEONGHEE LEE", "20180219");
		
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
