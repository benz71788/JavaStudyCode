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
			System.out.println("��ġ�: �Ǹ����� ����");
		} else {
			System.out.println("��ġ�: " + kimchijjige);
		}
	}

	@Override
	public void orderBuDaejjige() {
		// TODO Auto-generated method stub
		if(budaejjige == 0) {
			System.out.println("�δ��: �Ǹ����� ����");
		} else {
			System.out.println("�δ��: " + budaejjige);
		}
	}

	@Override
	public void orderBiBimbap() {
		// TODO Auto-generated method stub
		if(bibimbap == 0) {
			System.out.println("�����: �Ǹ����� ����");
		} else {
			System.out.println("�����: " + bibimbap);
		}
	}

	@Override
	public void orderSunDaeguk() {
		// TODO Auto-generated method stub
		if(sundaeguk == 0) {
			System.out.println("���뱹: �Ǹ����� ����");
		} else {
			System.out.println("���뱹: " + sundaeguk);
		}
	}

	@Override
	public void orderGonggibap() {
		// TODO Auto-generated method stub
		if(gonggibap == 0) {
			System.out.println("�����: ����");
		} else {
			System.out.println("�����: " + gonggibap);
		}
	}

}
