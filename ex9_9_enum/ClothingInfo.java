package ex9_9_enum;

class ClothingInfo {
	
	String code;
	String name;
	String material;
	Season season;	//season에는 열거 상수만 대입할 수 있다.
	
	ClothingInfo(String code, String name, String material, Season season){
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
//		this.season = 5;	//(컴파일 에러 발생);
	}

}
