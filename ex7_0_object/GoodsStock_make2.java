package ex7_0_object;

public class GoodsStock_make2 {
	
	public static void main(String[] args) {
		
		GoodsStock2 gs = new GoodsStock2();
		gs.goodsCode = "A1234";
		gs.stock = 100;
		
		System.out.println("GoodsCode: " + gs.goodsCode);
		System.out.println("StockNum: " + gs.stock);
		
		gs.addStock(30);
		
		System.out.println("GoodsCode: " + gs.goodsCode);
		System.out.println("CurrentNum: " + gs.stock);
		
		System.out.println("====================");
		
		GoodsStock2 gs2 = new GoodsStock2();
		gs2.goodsCode = "G1234";
		gs2.stock = 150;
		
		System.out.println("GoodsCode: " + gs2.goodsCode);
		System.out.println("StockNum: " + gs2.stock);
		
		gs2.subtractStock(100);
		
		System.out.println("GoodsCode: " + gs2.goodsCode);
		System.out.println("CurrentNum: " + gs2.stock);
		
	}
}
