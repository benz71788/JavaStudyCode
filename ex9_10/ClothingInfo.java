package ex9_10;

//사계절 열거 타입을 클래스 안에 선언해서 사용한 예
//클래스 파일들을 확인해 봅니다.
//이 소스 파일을 컴파일 하면 다음과 같이 두 개의 클래스 파일이 생성
//ClothingInfo$Season.class, ClothingInfo.class 생성
//ClothingInfo$Season.class의미는
//ClothingInfo 클래스 안에 있는 Season 열거 타입의 컴파일 결과물입니다.
class ClothingInfo {
	
	enum Season{
		SPRING, SUMMER, FALL, WINTER
	}
	
	String code;
	String name;
	String material;
	Season season;	//season에는 열거 상수만 대입할 수 있다.
	
	ClothingInfo(String code, String name, String material, Season season){
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

}
