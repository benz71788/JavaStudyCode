package ex9_8_enum_need;

public class OldExample {
	
	public static void main(String[] args) {
		
		//ClothingInfo.SUMMER : ClothingInfo Ŭ������ ����� ��� �ʵ� ���N
		ClothingInfo clothing = 
				new ClothingInfo("32919", "����Ƽ����", "��100%", ClothingInfo.SUMMER);
		
		System.out.println("��ǰ�ڵ�: " + clothing.code);
		System.out.println("��ǰ��: " + clothing.name);
		System.out.println("����: " + clothing.material);
		System.out.println("��������: " + clothing.season);
	}

}