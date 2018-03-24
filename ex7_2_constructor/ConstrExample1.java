package ex7_2_constructor;

public class ConstrExample1 {
	
	public static void main(String[] agrs) {
		GoodsStock gs = new GoodsStock("52134", 200);

		System.out.println("GoodsCode: " + gs.goodsCode);
		System.out.println("StockNum: " + gs.stock);
		
		gs.addStock(30);
		
		System.out.println("GoodsCode: " + gs.goodsCode);
		System.out.println("CurrentNum: " + gs.stock);
		
		System.out.println("====================");
		
		GoodsStock gs2 = new GoodsStock("23145", 1000);

		System.out.println("GoodsCode: " + gs2.goodsCode);
		System.out.println("StockNum: " + gs2.stock);
		
		gs2.subtractStock(500);
		
		System.out.println("GoodsCode: " + gs2.goodsCode);
		System.out.println("CurrentNum: " + gs2.stock);
	}

}
