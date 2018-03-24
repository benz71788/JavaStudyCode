package ex7_0_object;

public class GoodsStock_make {
	
	public static void main(String[] args) {
		
		GoodsStock gs = new GoodsStock();
		gs.goodsCode = "A1234";
		gs.stock = 100;
		
		System.out.println("GoodsCode: " + gs.goodsCode);
		System.out.println("StockNum: " + gs.stock);
		
		gs.addStock(30);
		
		System.out.println("GoodsCode: " + gs.goodsCode);
		System.out.println("CurrentNum: " + gs.stock);
		
		System.out.println("====================");
		
		GoodsStock gs2 = new GoodsStock();
		gs2.goodsCode = "G1234";
		gs2.stock = 150;
		
		System.out.println("GoodsCode: " + gs2.goodsCode);
		System.out.println("StockNum: " + gs2.stock);
		
		gs2.subtractStock(100);
		
		System.out.println("GoodsCode: " + gs2.goodsCode);
		System.out.println("CurrentNum: " + gs2.stock);
		
		
	}

}
