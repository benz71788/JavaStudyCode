package ex9_10;

public class NewExample {
	
	public static void main(String[] args) {
		
		ClothingInfo clothing = 
				new ClothingInfo("32919", "����Ƽ����", "��100%", ClothingInfo.Season.SUMMER);
		
		System.out.println("��ǰ�ڵ�: " + clothing.code);
		System.out.println("��ǰ��: " + clothing.name);
		System.out.println("����: " + clothing.material);
		System.out.println("��������: " + clothing.season);
	}

}
