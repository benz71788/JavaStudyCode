package ex14_1_Wrapper;

//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼ҵ� - valueOf
public class Wrapper4_valueOf {
	
	public static void main(String[] args) {
		//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼ҵ�
		//�ڽ� - �⺻�� Ÿ���� ���� ��üȭ
		//int -> Integer
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);
		
		//�Ȱ��� �⺻���� ������ valueOf�޼ҵ带 ���� �� ȣ���ϸ�
		//���� ��ü�� ���� �������� ���ϵȴ�.
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2 : true");
		} else {
			System.out.println("obj1 == obj2 : false");
		}
	}

}
