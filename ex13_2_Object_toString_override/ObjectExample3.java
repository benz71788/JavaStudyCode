//Object의 toString 메소드 오버라이딩 예
package ex13_2_Object_toString_override;

class ObjectExample3 {
	
	public static void main(String[] args) {
		
		GoodsStock gs = new GoodsStock("12345", 90);
		
		String str = gs.toString();
		
		System.out.println(str);
		
		System.out.println(gs);
		
		System.out.println("=================================");
		
		GoodsStock gs2 = new GoodsStock("57293", 100);
		String str2 = "재고정보 = " + gs2;
		//문자열과 GoodsStock 객체 변수를 +연산자로 연결하면
		//그 객체의 toString 메소드가 자동으로 호출된 후 문자열이 연결된다.
		// String str = "재고정보 = " + gs2.toString()
		System.out.println(str2);
		
	}
	
	
}
