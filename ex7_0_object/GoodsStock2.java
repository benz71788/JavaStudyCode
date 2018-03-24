package ex7_0_object;

public class GoodsStock2 {
	
	/*생성자: 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'입니다.
	 * 따라서 인스턴스 변수의 초기화 작업에 주로 사용되며 인스턴스 생성시에 실행되어야 할
	 * 작업을 위해서도 사용됩니다.
	 * 생성자 조건)
	 * 	1. 생성자의 이름은 클래스의 이름과 같아야 하니다.
	 *  2. 생성자는 리턴 값이 없습니다.
	 */
	
	public GoodsStock2() {
	}
	
	public void addStock(int num) {
		stock = stock + num;
	}
	
	public int subtractStock(int num) {
		if(stock < num) {
			return 0;
		}
		
		stock = stock - num;
		
		return stock;
	}
	
	String goodsCode;
	int stock;
	

}
