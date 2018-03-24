package ex8_10_abstract_ex;

public class StoreExample1 {
	
	public static void main(String[] args) {
		
		HousingStore housing = 
				new HousingStore(4500, 5000, 6000, 0, 1000);
		UniversityRoadStore universityRoad =
				new UniversityRoadStore(5000, 5000, 5000, 4000, 0);
		StockRoadStore stockRoad =
				new StockRoadStore(6000, 7000, 7000, 6000, 1000);
		
		housing.orderKimChijjige();
		housing.orderBuDaejjige();
		housing.orderBiBimbap();
		housing.orderSunDaeguk();
		housing.orderGonggibap();
		
		System.out.println("---------------------");
		
		universityRoad.orderKimChijjige();
		universityRoad.orderBuDaejjige();
		universityRoad.orderBiBimbap();
		universityRoad.orderSunDaeguk();
		universityRoad.orderGonggibap();
		
		System.out.println("---------------------");
		
		stockRoad.orderKimChijjige();
		stockRoad.orderBuDaejjige();
		stockRoad.orderBiBimbap();
		stockRoad.orderSunDaeguk();
		stockRoad.orderGonggibap();
	}

}
