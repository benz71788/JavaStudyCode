package ex9_9_enum;

class ClothingInfo {
	
	String code;
	String name;
	String material;
	Season season;	//season���� ���� ����� ������ �� �ִ�.
	
	ClothingInfo(String code, String name, String material, Season season){
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
//		this.season = 5;	//(������ ���� �߻�);
	}

}
