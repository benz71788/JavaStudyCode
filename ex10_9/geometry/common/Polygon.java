package ex10_9.geometry.common;

//protected ������Ҹ� �����ϴ� Ŭ������ ��
public class Polygon {
	
	public int x[];
	protected int y[];	//�������� Y ��ǥ
	
	protected Polygon(int vertexNum){	// ������
		x = new int[vertexNum];
		y = new int[vertexNum];
	}
	
	// �������� ��ǥ�� �����Ѵ�.
	protected void setPoint(int index, int x, int y){
		this.x[index] = x;
		this.y[index] = y;
	}
	
}
