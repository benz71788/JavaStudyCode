package ex9_9_enum;

public class OldExample {
	
	public static void main(String[] args) {
		
		//ClothingInfo.SUMMER : ClothingInfo 클래스에 선언된 상수 필드 사용N
		ClothingInfo clothing = 
				new ClothingInfo("32919", "반팔티셔츠", "면100%", Season.SUMMER);
		
		System.out.println("상품코드: " + clothing.code);
		System.out.println("상품명: " + clothing.name);
		System.out.println("소재: " + clothing.material);
		System.out.println("계절구분: " + clothing.season);
	}

}
