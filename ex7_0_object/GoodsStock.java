package ex7_0_object;

public class GoodsStock {
	
	String goodsCode;
	int stock;
	
	/*������: �ν��Ͻ��� ������ �� ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���'�Դϴ�.
	 * ���� �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿ�� ��
	 * �۾��� ���ؼ��� ���˴ϴ�.
	 * ������ ����)
	 * 	1. �������� �̸��� Ŭ������ �̸��� ���ƾ� �ϴϴ�.
	 *  2. �����ڴ� ���� ���� �����ϴ�.
	 */
	
	public GoodsStock() {
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

}