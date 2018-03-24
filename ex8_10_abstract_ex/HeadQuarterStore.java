package ex8_10_abstract_ex;

abstract public class HeadQuarterStore {
	
	int kimchijjige;
	int budaejjige;
	int bibimbap;
	int sundaeguk;
	int gonggibap;
	
	public HeadQuarterStore(int kimchijjige, int budaejjige, 
			int bibimbap, int sundaeguk, int gonggibap) {
		this.kimchijjige = kimchijjige;
		this.budaejjige = budaejjige;
		this.bibimbap = bibimbap;
		this.sundaeguk = sundaeguk;
		this.gonggibap = gonggibap;
	}
	
	public abstract void orderKimChijjige();
	public abstract void orderBuDaejjige();
	public abstract void orderBiBimbap();
	public abstract void orderSunDaeguk();
	public abstract void orderGonggibap();

}
