package ex8_10_abstract_ex;

public class StockRoadStore extends HeadQuarterStore {
	
	public StockRoadStore(int kimchijjige, int budaejjige, 
			int bibimbap, int sundaeguk, int gonggibap) {
		super(kimchijjige, budaejjige, bibimbap, sundaeguk, gonggibap);
	}

	@Override
	public void orderKimChijjige() {
		// TODO Auto-generated method stub
		if(kimchijjige == 0) {
			System.out.println("김치찌개: 판매하지 않음");
		} else {
			System.out.println("김치찌개: " + kimchijjige);
		}
	}

	@Override
	public void orderBuDaejjige() {
		// TODO Auto-generated method stub
		if(budaejjige == 0) {
			System.out.println("부대찌개: 판매하지 않음");
		} else {
			System.out.println("부대찌개: " + budaejjige);
		}
	}

	@Override
	public void orderBiBimbap() {
		// TODO Auto-generated method stub
		if(bibimbap == 0) {
			System.out.println("비빔밥: 판매하지 않음");
		} else {
			System.out.println("비빔밥: " + bibimbap);
		}
	}

	@Override
	public void orderSunDaeguk() {
		// TODO Auto-generated method stub
		if(sundaeguk == 0) {
			System.out.println("순대국: 판매하지 않음");
		} else {
			System.out.println("순대국: " + sundaeguk);
		}
	}

	@Override
	public void orderGonggibap() {
		// TODO Auto-generated method stub
		if(gonggibap == 0) {
			System.out.println("공기밥: 무료");
		} else {
			System.out.println("공기밥: " + gonggibap);
		}
	}

}
