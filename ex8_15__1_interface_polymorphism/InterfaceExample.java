package ex8_15__1_interface_polymorphism;

public class InterfaceExample {
	
	public static void main(String[] args) {
		
//		Lendable arr0, arr1, arr2;
//		
//		arr0 = new SeparateVolume("883��", "Ǫ���� ����", "����");
//		arr1 = new SeparateVolume("609.2", "����̼���", "���긮ġ");
//		arr2 = new AppCDInfo("02-17", "XML�� ���� �ڹ� ���α׷���");
//		
//		checkOutAll(arr0, "�̼���", "20180201");
//		checkOutAll(arr1, "�̼���", "20180201");
//		checkOutAll(arr2, "�̼���", "20180201");
		
		Lendable[] arr = new Lendable[3];
		
		arr[0] = new SeparateVolume("883��", "Ǫ���� ����", "����");
		arr[1] = new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr[2] = new AppCDInfo("02-17", "XML�� ���� �ڹ� ���α׷���");
		
		checkOutAll(arr, "�̼���", "20180201");

	}
	
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪
	//�ʵ��� ���� ���θ� üũ�ϱ� ������
	//Lendable �������̽��� chectOut�޼ҵ尡 �־�� ������ ������ �����ϴ�.
	static void checkOutAll(Lendable[] arr, String borrower, String date) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++) {
			arr[i].checkOut(borrower, date);
			arr[i].checkIn();
			System.out.println("=====================================\n");
		}
	}

}
