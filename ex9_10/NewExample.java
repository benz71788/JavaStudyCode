package ex9_10;

public class NewExample {
	
	public static void main(String[] args) {
		
		ClothingInfo clothing = 
				new ClothingInfo("32919", "반팔티셔츠", "면100%", ClothingInfo.Season.SUMMER);
		
		System.out.println("상품코드: " + clothing.code);
		System.out.println("상품명: " + clothing.name);
		System.out.println("소재: " + clothing.material);
		System.out.println("계절구분: " + clothing.season);
	}

}
