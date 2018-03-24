package ex9_10;

//����� ���� Ÿ���� Ŭ���� �ȿ� �����ؼ� ����� ��
//Ŭ���� ���ϵ��� Ȯ���� ���ϴ�.
//�� �ҽ� ������ ������ �ϸ� ������ ���� �� ���� Ŭ���� ������ ����
//ClothingInfo$Season.class, ClothingInfo.class ����
//ClothingInfo$Season.class�ǹ̴�
//ClothingInfo Ŭ���� �ȿ� �ִ� Season ���� Ÿ���� ������ ������Դϴ�.
class ClothingInfo {
	
	enum Season{
		SPRING, SUMMER, FALL, WINTER
	}
	
	String code;
	String name;
	String material;
	Season season;	//season���� ���� ����� ������ �� �ִ�.
	
	ClothingInfo(String code, String name, String material, Season season){
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

}
