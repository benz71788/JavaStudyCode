package ex9_8_enum_need;

class ClothingInfo {
	
	String code;
	String name;
	String material;
	int season;
	
	//������� ǥ���ϴ� ��� �ʵ�
	static final int SPRING = 1;
	static final int SUMMER = 2;
	static final int AUTUMN = 3;
	static final int WINTER = 4;
	
	ClothingInfo(String code, String name, String material, int season){
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
//		this.season = 5;
	}

}
